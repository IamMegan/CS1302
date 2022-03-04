package prob1;

public class ProductTest {

	/***
	 * YOU SHOULD WRITE THESE TEST METHODS.
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("-----------NEW TEST----------------");
		testProductConstructor_Plant_3chars_Batch_2chars();
		testProductConstructor_Plant_3chars_Batch_1chars();
		testProductConstructor_Plant_2chars_Batch_2chars();
		testProductConstructor_Plant_2chars_Batch_1chars();
		testIsAfter2000Test_True_Year2019();
		testIsAfter2000Test_True_Year2000();
		testIsAfter2000Test_False_Year1994();
		testIsMonthEqual_True();
		testIsMonthEqual_False();
	}
	
	/***
	 * Construct a product where the plant has 3 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_2chars() {
		System.out.println("-->testProductConstructor_Plant_3chars_Batch_2chars()");
		String code = "Meg0429200021";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		String actualMsg = String.format("Actual: \n Code: %s\n Plant: %s\n Date: %s\n Batch: %d\n", code, plant, date, batch);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
				
	}

	/***
	 * Construct a product where the plant has 3 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_3chars_Batch_1chars()");
		String code = "Meg042920001";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		String actualMsg = String.format("Actual: \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n", code, plant, date, batch);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 1 \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_2chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_2chars()");
		String code = "Me0429200021";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		String actualMsg = String.format("Actual: \nExpected: \n Code: %s\n Plant: %s\n Date: %s\n Batch: %d\n", code, plant, date, batch);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Me \n Date: 04292000 \n Batch: 21 \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_1chars()");
		String code = "Me042920001";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		String actualMsg = String.format("Actual: \nExpected: \n Code: %s\n Plant: %s\n Date: %s\n Batch: %d\n", code, plant, date, batch);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Me \n Date: 04292000 \n Batch: 1 \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the year is 2019 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2019() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2019()");
		String code = "Meg0429201921";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		boolean isAfter2000 = p.isAfter2000();
		String actualMsg = String.format("Actual: \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n Is after 2000? %s\n", code, plant, date, batch, isAfter2000);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n Is after 2000? True \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the year is 2000 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2000() {
		String code = "Meg0429200021";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		boolean isAfter2000 = p.isAfter2000();
		String actualMsg = String.format("Actual \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n Is after 2000? %s\n", code, plant, date, batch, isAfter2000);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n Is after 2000? True \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the year is 1994 and then call isAfter2000() which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_False_Year1994() {
		String code = "Meg0429199421";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		boolean isAfter2000 = p.isAfter2000();
		String actualMsg = String.format("Actual: \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n Is after 2000? %s\n", code, plant, date, batch, isAfter2000);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n Is after 2000? False \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(2) which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_True() {
		System.out.println("\n-->testIsMonthEqual_True()");
		String code = "Meg022920001";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		boolean mon = p.isMonthEqual(2);
		String actualMsg = String.format("Actual: \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n Is Month Equal? %s\n", code, plant, date, batch, mon);
		String expectedMsg = "Dxpected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n Is month Equal? True \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(3) which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_False() {
		System.out.println("\n-->testIsMonthEqual_False()");
		String code = "Meg022920001";
		Product p = new Product(code);
		String plant = p.getPlant();
		String date = p.getDate();
		int batch = p.getBatch();
		boolean mon = p.isMonthEqual(3);
		String actualMsg = String.format("Actual: \nCode: %s\n Plant: %s\n Date: %s\n Batch: %d\n Is Month Equal? %s\n", code, plant, date, batch, mon);
		String expectedMsg = "Expected: \n Code: Meg0429200021 \n Plant: Meg \n Date: 04292000 \n Batch: 21 \n Is month Equal? False \n";
		System.out.print(expectedMsg);
		System.out.print(actualMsg);
	}

	}

