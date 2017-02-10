package com.jme3.system.jopenvr;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1501</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class VR_IVRChaperone_FnTable extends Structure {
	/** C type : GetCalibrationState_callback* */
	public VR_IVRChaperone_FnTable.GetCalibrationState_callback GetCalibrationState;
	/** C type : GetPlayAreaSize_callback* */
	public VR_IVRChaperone_FnTable.GetPlayAreaSize_callback GetPlayAreaSize;
	/** C type : GetPlayAreaRect_callback* */
	public VR_IVRChaperone_FnTable.GetPlayAreaRect_callback GetPlayAreaRect;
	/** C type : ReloadInfo_callback* */
	public VR_IVRChaperone_FnTable.ReloadInfo_callback ReloadInfo;
	/** C type : SetSceneColor_callback* */
	public VR_IVRChaperone_FnTable.SetSceneColor_callback SetSceneColor;
	/** C type : GetBoundsColor_callback* */
	public VR_IVRChaperone_FnTable.GetBoundsColor_callback GetBoundsColor;
	/** C type : AreBoundsVisible_callback* */
	public VR_IVRChaperone_FnTable.AreBoundsVisible_callback AreBoundsVisible;
	/** C type : ForceBoundsVisible_callback* */
	public VR_IVRChaperone_FnTable.ForceBoundsVisible_callback ForceBoundsVisible;
	/** <i>native declaration : headers\openvr_capi.h:1493</i> */
	public interface GetCalibrationState_callback extends Callback {
		int apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1494</i> */
	public interface GetPlayAreaSize_callback extends Callback {
		byte apply(FloatByReference pSizeX, FloatByReference pSizeZ);
	};
	/** <i>native declaration : headers\openvr_capi.h:1495</i> */
	public interface GetPlayAreaRect_callback extends Callback {
		byte apply(HmdQuad_t rect);
	};
	/** <i>native declaration : headers\openvr_capi.h:1496</i> */
	public interface ReloadInfo_callback extends Callback {
		void apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1497</i> */
	public interface SetSceneColor_callback extends Callback {
		void apply(HmdColor_t.ByValue color);
	};
	/** <i>native declaration : headers\openvr_capi.h:1498</i> */
	public interface GetBoundsColor_callback extends Callback {
		void apply(HmdColor_t pOutputColorArray, int nNumOutputColors, float flCollisionBoundsFadeDistance, HmdColor_t pOutputCameraColor);
	};
	/** <i>native declaration : headers\openvr_capi.h:1499</i> */
	public interface AreBoundsVisible_callback extends Callback {
		byte apply();
	};
	/** <i>native declaration : headers\openvr_capi.h:1500</i> */
	public interface ForceBoundsVisible_callback extends Callback {
		void apply(byte bForce);
	};
	public VR_IVRChaperone_FnTable() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("GetCalibrationState", "GetPlayAreaSize", "GetPlayAreaRect", "ReloadInfo", "SetSceneColor", "GetBoundsColor", "AreBoundsVisible", "ForceBoundsVisible");
	}
	/**
	 * @param GetCalibrationState C type : GetCalibrationState_callback*<br>
	 * @param GetPlayAreaSize C type : GetPlayAreaSize_callback*<br>
	 * @param GetPlayAreaRect C type : GetPlayAreaRect_callback*<br>
	 * @param ReloadInfo C type : ReloadInfo_callback*<br>
	 * @param SetSceneColor C type : SetSceneColor_callback*<br>
	 * @param GetBoundsColor C type : GetBoundsColor_callback*<br>
	 * @param AreBoundsVisible C type : AreBoundsVisible_callback*<br>
	 * @param ForceBoundsVisible C type : ForceBoundsVisible_callback*
	 */
	public VR_IVRChaperone_FnTable(VR_IVRChaperone_FnTable.GetCalibrationState_callback GetCalibrationState, VR_IVRChaperone_FnTable.GetPlayAreaSize_callback GetPlayAreaSize, VR_IVRChaperone_FnTable.GetPlayAreaRect_callback GetPlayAreaRect, VR_IVRChaperone_FnTable.ReloadInfo_callback ReloadInfo, VR_IVRChaperone_FnTable.SetSceneColor_callback SetSceneColor, VR_IVRChaperone_FnTable.GetBoundsColor_callback GetBoundsColor, VR_IVRChaperone_FnTable.AreBoundsVisible_callback AreBoundsVisible, VR_IVRChaperone_FnTable.ForceBoundsVisible_callback ForceBoundsVisible) {
		super();
		this.GetCalibrationState = GetCalibrationState;
		this.GetPlayAreaSize = GetPlayAreaSize;
		this.GetPlayAreaRect = GetPlayAreaRect;
		this.ReloadInfo = ReloadInfo;
		this.SetSceneColor = SetSceneColor;
		this.GetBoundsColor = GetBoundsColor;
		this.AreBoundsVisible = AreBoundsVisible;
		this.ForceBoundsVisible = ForceBoundsVisible;
	}
	public VR_IVRChaperone_FnTable(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends VR_IVRChaperone_FnTable implements Structure.ByReference {
		
	};
	public static class ByValue extends VR_IVRChaperone_FnTable implements Structure.ByValue {
		
	};
}
