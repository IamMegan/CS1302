package prob1;

public class Product {
		
		private int batch;
		private String code;
		private String date;
		private int indexDateBegins;
		private String plant;
		
		public Product(String code) {
			this.code = code;
		}
		
		
		private String extractPlant() {
			if(Character.isLetter(this.code.charAt(2))) {
				this.plant = code.substring(0,3);
				return plant;
				
			}
			else {
				this.plant = code.substring(0,2);
				return plant;
			}
		}
		
		private String extractDate() {
			if(Character.isLetter(this.code.charAt(2))) {
				this.date = code.substring(3,11);
				return date;
			}
			else {
				this.date = code.substring(2,10);
				return date;
			}
		}
		
		private int extractBatch() {
			if(Character.isLetter(this.code.charAt(2))) {
				this.batch = Integer.parseInt(code.substring(11, code.length()));
				return batch;
			}
			else {
			
			this.batch = Integer.parseInt(code.substring(10, code.length()));
			return batch;
			}
		}
			
		public boolean isAfter2000() {
			String interDate = extractDate();
			int year = Integer.parseInt(interDate.substring(4,8));
			boolean flag = false;
			if(year > 1999) {
				flag = true;
			}
			return flag;
		}
		
		public boolean isMonthEqual(int month) {
			String interDate = extractDate();
			int interMonth = Integer.parseInt(date.substring(0,2));
			boolean flag = false;
			if(interMonth == month) {
				flag = true;
			}
			return flag;
		}
			
		public String getCode() {
			return code;
		}
		
		public String getDate() {
			extractDate();
			return date;
		}
		
		public int getBatch() {
			extractBatch();
			return batch;
		}
		
		public String getPlant() {
			extractPlant();
			return plant;
		}
}
		

