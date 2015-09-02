package amidst.clazz.real.finder.detect;

import amidst.clazz.real.RealClass;

public class NumberOfFieldsRCD extends RealClassDetector {
	private int count;

	public NumberOfFieldsRCD(int count) {
		this.count = count;
	}

	@Override
	public boolean detect(RealClass byteClass) {
		return byteClass.getFields().length == count;
	}
}
