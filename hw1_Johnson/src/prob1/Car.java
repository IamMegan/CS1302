package prob1;

public class Car {
		
		private double fuelCapacity;
		private double fuelEfficiency;
		private double fuelLevel;
		private double totalDistance;
		
		public Car(double fuelCapacity, double fuelEfficiency) {
			this.fuelCapacity = fuelCapacity;
			this.fuelEfficiency = fuelEfficiency;
			this.fuelLevel = 0;
			this.totalDistance = 0;
			}
		
		public Car(double fuelCapacity, double fuelEfficiency, double fuelLevel) {
			this.fuelCapacity = fuelCapacity;
			this.fuelEfficiency = fuelEfficiency;
			this.fuelLevel = fuelLevel;
			this.totalDistance = 0;
			}
		
		public double getFuelCapacity() {
			return fuelCapacity;
			}
		
		public double getFuelEfficiency() {
			return fuelEfficiency;
			}
		
		public double getFuelLevel() {
			return fuelLevel;
			}
		
		public double getTotalDistance() {
			return totalDistance;
			}
		
		public void fillUp(double amount) {
				if(amount + this.fuelLevel <= this.fuelCapacity) {
					this.fuelLevel += amount;
				}
				else {
					this.fuelLevel = this.fuelCapacity;
				}
			}
			
		
		public void drive(double time, double rate) {
			if((time*rate) /fuelEfficiency <= fuelLevel) {
				totalDistance += time*rate;
				fuelLevel -= (time*rate)/fuelEfficiency;
			}
			else {
				totalDistance = fuelLevel*fuelEfficiency;
				fuelLevel = 0;
			}
			
			}
		@Override
		public String toString(){
			return "fuelLevel=" + fuelLevel + ", totalDistance=" + totalDistance + ", fuelCapacity" + fuelCapacity + ", fuelEfficiency=" + fuelEfficiency;
		}
		
		}

