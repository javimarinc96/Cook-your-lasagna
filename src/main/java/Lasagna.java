public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
        public int expectedMinutesInOven(){
            return 40;
        }
    // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int actualMinutes){
            return 40 - actualMinutes;
        }    
    // TODO: define the 'preparationTimeInMinutes()' method
        public int preparationTimeInMinutes(int numberLayers){
            return 2 * numberLayers;
        }
    // TODO: define the 'totalTimeInMinutes()' method
            public int totalTimeInMinutes(int numberLayers, int minutesTaken){
            return (2 * numberLayers) + minutesTaken;
        }
}
