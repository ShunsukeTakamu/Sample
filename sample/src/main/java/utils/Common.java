package utils;

public class Common {
	/**
	 * BMIの計算
	 * 
	 * @return BMI値
	 */
	public static double calcBmi(double h, double w) {
		double bmi = w / (h * h);
		return bmi;
	}
	
	/**
	 * 
	 * 
	 * @param bmi BMI値
	 * @return 痩せ気味/標準/肥満気味
	 */
	public static String getBmiResult(double bmi) {
		String str = null;
		
		if (bmi < 18.5) {
			str = "痩せ気味";
		} else if (bmi < 25) {
			str = "標準";
		} else {
			str = "肥満気味";
		}
		
		return str;
	}
}
