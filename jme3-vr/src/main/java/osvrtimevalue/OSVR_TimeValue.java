package osvrtimevalue;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OSVR_TimeValue extends Structure {
	/** C type : OSVR_TimeValue_Seconds */
	public long seconds;
	/** C type : OSVR_TimeValue_Microseconds */
	public int microseconds;
	public OSVR_TimeValue() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("seconds", "microseconds");
	}
	/**
	 * @param seconds C type : OSVR_TimeValue_Seconds<br>
	 * @param microseconds C type : OSVR_TimeValue_Microseconds
	 */
	public OSVR_TimeValue(long seconds, int microseconds) {
		super();
		this.seconds = seconds;
		this.microseconds = microseconds;
	}
	public OSVR_TimeValue(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends OSVR_TimeValue implements Structure.ByReference {
		
	};
	public static class ByValue extends OSVR_TimeValue implements Structure.ByValue {
		
	};
}
