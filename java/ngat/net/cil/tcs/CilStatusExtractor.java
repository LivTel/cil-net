/*   
    Copyright 2006, Astrophysics Research Institute, Liverpool John Moores University.

    This file is part of Cil Emulator.

    Cil Emulator is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Cil Emulator is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Cil Emulator; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package ngat.net.cil.tcs;

import ngat.astrometry.*;
import ngat.util.logging.*;
import ngat.message.RCS_TCS.*;

import java.util.*;
import java.text.*;

/**
 * As a rule TcsStatusPacket stores its fields in the form (units) they were received
 * from the TCS. E.g. angles (az.pos) etc arre in degrees etc.
 */
public class CilStatusExtractor {

	protected Properties prop;

	/** Stores the key from the actual command sent. */
	protected int key;

	/** Error logging. */
	protected LogGenerator logger;

	public CilStatusExtractor(int key) {
		this.key = key;
		Logger alogger = LogManager.getLogger("CIL");
		logger = alogger.generate().system("COMMS")
					.subSystem("CIL")
					.srcCompClass(this.getClass().getName())
					.srcCompId("CSX_");
	}

	public TcsStatusPacket.Segment translate(Properties prop) throws ParseException {
		this.prop = prop;
		TcsStatusPacket.Segment xstatus = null;

		try {
			switch (key) {
			// Astrometry.
			case SHOW.ASTROMETRY: {
				TcsStatusPacket.Astrometry status = new TcsStatusPacket.Astrometry();

				status.refractionPressure = parseDouble(1);
				status.refractionTemperature = parseDouble(2);
				status.refractionHumidity = parseDouble(3);
				status.refractionWavelength = parseDouble(4);
				status.ut1_utc = parseDouble(5);
				status.tdt_utc = parseDouble(6);
				status.polarMotion_X = parseDouble(7);
				status.polarMotion_Y = parseDouble(8);
				status.airmass = parseDouble(9);
				status.agwavelength = parseDouble(10);
				xstatus = status;
			}
				break;

			// Autoguider.
			case SHOW.AUTOGUIDER: {
				TcsStatusPacket.Autoguider status = new TcsStatusPacket.Autoguider();
				// System.err.println("Parsing [SHOW AG] Response: at posn 3: "+parseString
				// (3)+
				// " ("+TcsStatusPacket.getCode(parseString (3))+")");
				status.agSelected = parseString(1);
				status.agStatus = TcsStatusPacket.getCode(parseString(2));
				status.agSwState = TcsStatusPacket.getCode(parseString(3));
				status.guideStarMagnitude = parseDouble(4);
				status.fwhm = parseDouble(5);

				status.agMirrorDemand = parseDouble(6);
				status.agMirrorPos = parseDouble(7);
				status.agMirrorStatus = TcsStatusPacket.getCode(parseString(8));

				status.agFocusDemand = parseDouble(9);
				status.agFocusPos = parseDouble(10);
				status.agFocusStatus = TcsStatusPacket.getCode(parseString(11));

				status.agFilterDemand = TcsStatusPacket.getCode(parseString(12));
				status.agFilterPos = TcsStatusPacket.getCode(parseString(13));
				status.agFilterStatus = TcsStatusPacket.getCode(parseString(14));
				xstatus = status;
				// System.err.println("SDTrans::Autoguider state after parsing: "+xstatus);
			}
				break;

			// Calibrate.
			case SHOW.CALIBRATE: {
				TcsStatusPacket.Calibrate status = new TcsStatusPacket.Calibrate();

				status.defAzError = parseDouble(1);
				status.defAltError = parseDouble(2);
				status.defCollError = parseDouble(3);

				status.currAzError = parseDouble(4);
				status.currAltError = parseDouble(5);
				status.currCollError = parseDouble(6);

				status.lastAzError = parseDouble(7);
				status.lastAzRms = parseDouble(8);

				status.lastAltError = parseDouble(9);
				status.lastAltRms = parseDouble(10);

				status.lastCollError = parseDouble(11);
				status.lastCollRms = parseDouble(12);

				status.lastSkyRms = parseDouble(13);
				xstatus = status;
			}
				break;

			// Focus.
			case SHOW.FOCUS: {
				TcsStatusPacket.FocalStation status = new TcsStatusPacket.FocalStation();

				status.station = parseString(1);
				status.instr = parseString(2);
				status.ag = parseString(3);
				xstatus = status;
			}
				break;

			// Limits.
			case SHOW.LIMITS: {
				TcsStatusPacket.Limits status = new TcsStatusPacket.Limits();

				status.azPosLimit = parseDouble(1);
				status.azNegLimit = parseDouble(2);
				// System.err.println("RGO_Transl::Received Limits: "+status.azPosLimit+" - "+status.azNegLimit);
				status.altPosLimit = parseDouble(3);
				status.altNegLimit = parseDouble(4);

				status.rotPosLimit = parseDouble(5);
				status.rotNegLimit = parseDouble(6);

				status.timeToAzLimit = parseDouble(7, "!", 999.0) * 3600.0;
				status.azLimitSense = TcsStatusPacket.getCode(parseString(8));

				status.timeToAltLimit = parseDouble(9, "!", 999.0) * 3600.0;
				status.altLimitSense = TcsStatusPacket.getCode(parseString(10));

				status.timeToRotLimit = parseDouble(11, "!", 999.0) * 3600.0;
				status.rotLimitSense = TcsStatusPacket.getCode(parseString(12));
				xstatus = status;
			}
				break;

			// Mechanisms.
			case SHOW.MECHANISMS: {
				TcsStatusPacket.Mechanisms status = new TcsStatusPacket.Mechanisms();

				status.azName = "NOTKNOWN";// parseString(0);
				status.azDemand = parseDouble(1);
				status.azPos = parseDouble(2);
				status.azStatus = TcsStatusPacket.getCode(parseString(3));

				status.altName = parseString(0);
				status.altDemand = parseDouble(4);
				status.altPos = parseDouble(5);
				status.altStatus = TcsStatusPacket.getCode(parseString(6));

				status.rotName = parseString(0);
				status.rotDemand = parseDouble(7);
				status.rotPos = parseDouble(8);
				status.rotMode = TcsStatusPacket.getCode(parseString(9));
				status.rotSkyAngle = parseDouble(10);
				status.rotStatus = TcsStatusPacket.getCode(parseString(11));

				status.encShutter1Name = parseString(0);
				status.encShutter1Demand = TcsStatusPacket.getCode(parseString(12));
				status.encShutter1Pos = TcsStatusPacket.getCode(parseString(13));
				status.encShutter1Status = TcsStatusPacket.getCode(parseString(14));

				status.encShutter2Name = parseString(0);
				status.encShutter2Demand = TcsStatusPacket.getCode(parseString(15));
				status.encShutter2Pos = TcsStatusPacket.getCode(parseString(16));
				status.encShutter2Status = TcsStatusPacket.getCode(parseString(17));

				status.foldMirrorName = parseString(0);
				status.foldMirrorDemand = TcsStatusPacket.getCode(parseString(18));
				status.foldMirrorPos = TcsStatusPacket.getCode(parseString(19));
				status.foldMirrorStatus = TcsStatusPacket.getCode(parseString(20));

				status.primMirrorName = parseString(0);
				status.primMirrorCoverDemand = TcsStatusPacket.getCode(parseString(21));
				status.primMirrorCoverPos = TcsStatusPacket.getCode(parseString(22));
				status.primMirrorCoverStatus = TcsStatusPacket.getCode(parseString(23));

				status.secMirrorName = parseString(0);
				status.secMirrorDemand = parseDouble(24);
				status.secMirrorPos = parseDouble(25);
				status.focusOffset = parseDouble(26);
				System.err.println(this.getClass().getName()+":SHOW.MECHANISMS:focus offset:"+
						   status.focusOffset);
				status.secMirrorStatus = TcsStatusPacket.getCode(parseString(27));

				status.primMirrorSysName = parseString(0);
				status.primMirrorSysStatus = TcsStatusPacket.getCode(parseString(28));
				xstatus = status;
			}
				break;

			// Meteorology.
			case SHOW.METEOROLOGY: {
				TcsStatusPacket.Meteorology status = new TcsStatusPacket.Meteorology();

				status.wmsStatus = TcsStatusPacket.getCode(parseString(1));
				status.rainState = TcsStatusPacket.getCode(parseString(2));

				status.serrurierTrussTemperature = parseDouble(3);
				status.oilTemperature = parseDouble(4);
				status.primMirrorTemperature = parseDouble(5);
				status.secMirrorTemperature = parseDouble(6);
				status.extTemperature = parseDouble(7);

				status.windSpeed = parseDouble(8);
				status.pressure = parseDouble(9);
				status.humidity = parseDouble(10); // fraction

				status.windDirn = parseDouble(11);

				status.moistureFraction = parseDouble(12);
				status.dewPointTemperature = parseDouble(13);
				status.agBoxTemperature = parseDouble(14);
				status.lightLevel = parseDouble(15);
				xstatus = status;
			}
				break;

			// Source.
			case SHOW.SOURCE: {
				TcsStatusPacket.SourceBlock status = new TcsStatusPacket.SourceBlock();

				status.srcName = parseString(1);
				status.srcRa = parseHMS(2); // RA string -> rads
				status.srcDec = parseDMS(3); // Dec string -> rads
				// System.err.println("StatusTranslator:: Storing SRC RA: "+status.srcRa+" (rads) Dec: "+status.srcDec+" (rads).");
				status.srcEquinoxLetter = parseEquinoxLetter(4);
				status.srcEquinox = parseEquinox(4); // watch for the start
														// letter. B/J/A
				status.srcEpoch = parseDouble(5);
				status.srcPmRA = parseDouble(6);
				status.srcPmDec = parseDouble(7);
				status.srcNsTrackRA = parseDouble(8);
				status.srcNsTrackDec = parseDouble(9);
				status.srcParallax = parseDouble(10);
				status.srcRadialVelocity = parseDouble(11);
				status.srcActRa = parseHMS(12);
				status.srcActDec = parseDMS(13);
				xstatus = status;
			}
				break;

			// State.
			case SHOW.STATE: {
				TcsStatusPacket.State status = new TcsStatusPacket.State();

				status.networkControlState = TcsStatusPacket.getCode(parseString(1));
				status.engineeringOverrideState = TcsStatusPacket.getCode(parseString(2));
				status.telescopeState = TcsStatusPacket.getCode(parseString(3));
				status.tcsState = TcsStatusPacket.getCode(parseString(4));
				status.systemRestartFlag = parseBoolean(5);
				status.systemShutdownFlag = parseBoolean(6);
				xstatus = status;
			}
				break;

			// TCS Version.
			case SHOW.VERSION: {
				TcsStatusPacket.Version status = new TcsStatusPacket.Version();

				status.tcsVersion = parseString(1);
				xstatus = status;
			}
				break;

			// Time.
			case SHOW.TIME: {
				TcsStatusPacket.Time status = new TcsStatusPacket.Time();

				status.mjd = parseDouble(1);
				status.ut1 = parseDouble(2); // seconds of MJD !!!!!!
				status.lst = parseDouble(3);

				status.timeStamp = System.currentTimeMillis(); // // TEMP should
																// be the UT1
																// value really
																// !
				xstatus = status;
			}
				break;
			default:
				break;
			}
		} catch (NumberFormatException pe) {
			System.out.println("RGO_SHOW::parse error returning NULL");
			return null;
			// throw new TranslationException("Error translating data: "+pe);
		}

		// System.out.println("RGO_SHOW::Returning an inst of: "+xstatus.getClass().getName());

		return xstatus;

	}

	private boolean parseBoolean(int key) {
		Integer ik = new Integer(key);
		String args = ((String) prop.get(ik)).trim();
		if (args.equals("true"))
			return true;
		return false;
	}

	private String parseString(int key) {
		String data = "NOT_SET";
		Integer ik = new Integer(key);
		String args = (String) prop.get(ik);
		if (args == null) {
			logger.create().info().level(3).block("parseStr").msg("String was not set for key " + key).send();
			args = data;
		}
		return args;
	}

	private long parseLong(int key) {
		long data = 0L;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		try {
			data = Long.parseLong(val);
		} catch (NumberFormatException e) {		
			logger.create().info().level(3).block("parseLong").msg("Error parsing Long from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	private double parseDouble(int key) {
		double data = 0.0;
		Integer ik = new Integer(key);
		String str = (String) prop.get(ik);
		if (str == null)
			return 0.0;
		String val = str.trim();
		try {
			data = Double.parseDouble(val);
		} catch (NumberFormatException e) {
			logger.create().info().level(3).block("parseDble").msg("Error parsing Double from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	/**
	 * Parse the String referenced by the specified arg number and if the String
	 * starts with char return the option value else the parsed value.
	 */
	private double parseDouble(int key, String optchar, double option) {
		double data = 0.0;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		if (val.startsWith(optchar))
			return option;
		try {
			data = Double.parseDouble(val);
		} catch (NumberFormatException e) {
			logger.create().info().level(3).block("parseDble").msg("Error parsing Double from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	private int parseInt(int key) {
		int data = 0;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		try {
			data = Integer.parseInt(val);
		} catch (NumberFormatException e) {	
			logger.create().info().level(3).block("parseInt").msg("Error parsing Int from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	private double parseHMS(int key) {
		double data = 0.0;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		System.err.println("StatusTranslator:: Parsing received HMS: " + val);
		try {
			data = AstroFormatter.parseHMS(val, " ");
			// System.err.println("StatusTranslator:: Returning parsed HMS rads: "+data);
		} catch (ParseException e) {
			logger.create().info().level(3).block("parseHMS").msg("Error parsing HMS from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	private double parseDMS(int key) {
		double data = 0.0;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		// System.err.println("StatusTranslator:: Parsing received DMS: "+val);
		try {
			data = AstroFormatter.parseDMS(val, " ");
			// System.err.println("StatusTranslator:: Returning parsed DMS rads: "+data);
		} catch (ParseException e) {
			logger.create().info().level(3).block("parseDMS").msg("Error parsing DMS from key: [" + key + "] = [" + val + "]").send();
		}
		return data;
	}

	private String parseEquinoxLetter(int key) {
		String data = "X";
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		if (val.startsWith("J"))
			return "J";
		else if (val.startsWith("B"))
			return "B";
		else if (val.startsWith("A"))
			return "A";
		else
			return "X";
	}

	/** NOte if the Start letter is A or something weird we get 0.0 returned. */
	private double parseEquinox(int key) {
		double data = 0.0;
		Integer ik = new Integer(key);
		String val = ((String) prop.get(ik)).trim();
		if (val.startsWith("J") || val.startsWith("B")) {
			val = val.substring(1);
			try {
				data = Double.parseDouble(val);
			} catch (NumberFormatException e) {			
				logger.create().info().level(3).block("parseEq").msg("Error parsing Eq from key: [" + key + "] = [" + val + "]").send();
			}
			return data;
		} else if (val.startsWith("A"))
			return 0.0;
		else
			return 0.0;
	}
}
