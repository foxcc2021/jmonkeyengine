package com.jme3.system.jopenvr;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : headers\openvr_capi.h:942</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class HmdQuad_t extends Structure {
	/**
	 * struct vr::HmdVector3_t[4]<br>
	 * C type : HmdVector3_t[4]
	 */
	public HmdVector3_t[] vCorners = new HmdVector3_t[4];
	public HmdQuad_t() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("vCorners");
	}
	/**
	 * @param vCorners struct vr::HmdVector3_t[4]<br>
	 * C type : HmdVector3_t[4]
	 */
	public HmdQuad_t(HmdVector3_t vCorners[]) {
		super();
		if ((vCorners.length != this.vCorners.length)) 
			throw new IllegalArgumentException("Wrong array size !");
		this.vCorners = vCorners;
	}
	public HmdQuad_t(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends HmdQuad_t implements Structure.ByReference {
		
	};
	public static class ByValue extends HmdQuad_t implements Structure.ByValue {
		
	};
}
