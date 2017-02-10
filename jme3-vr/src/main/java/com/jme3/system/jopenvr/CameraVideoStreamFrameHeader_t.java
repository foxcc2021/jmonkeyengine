package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:1127</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class CameraVideoStreamFrameHeader_t extends Structure {
	/**
	 * @see EVRTrackedCameraFrameType<br>
	 * C type : EVRTrackedCameraFrameType
	 */
	public int eFrameType;
	public int nWidth;
	public int nHeight;
	public int nBytesPerPixel;
	public int nFrameSequence;
	/** C type : TrackedDevicePose_t */
	public TrackedDevicePose_t standingTrackedDevicePose;
	public CameraVideoStreamFrameHeader_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("eFrameType", "nWidth", "nHeight", "nBytesPerPixel", "nFrameSequence", "standingTrackedDevicePose");
	}
	/**
	 * @param eFrameType @see EVRTrackedCameraFrameType<br>
	 * C type : EVRTrackedCameraFrameType<br>
	 * @param standingTrackedDevicePose C type : TrackedDevicePose_t
	 */
	public CameraVideoStreamFrameHeader_t(int eFrameType, int nWidth, int nHeight, int nBytesPerPixel, int nFrameSequence, TrackedDevicePose_t standingTrackedDevicePose) {
		super();
		this.eFrameType = eFrameType;
		this.nWidth = nWidth;
		this.nHeight = nHeight;
		this.nBytesPerPixel = nBytesPerPixel;
		this.nFrameSequence = nFrameSequence;
		this.standingTrackedDevicePose = standingTrackedDevicePose;
	}
	public CameraVideoStreamFrameHeader_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends CameraVideoStreamFrameHeader_t implements Structure.ByReference {
		
	};
	public static class ByValue extends CameraVideoStreamFrameHeader_t implements Structure.ByValue {
		
	};
}
