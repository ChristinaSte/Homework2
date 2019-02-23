package homework8.Task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> inGarageMap = new HashMap<>( );

    public void parking(Car car) {
        if (inGarageMap.containsKey(car)) {
            inGarageMap.put(car, inGarageMap.get(car) + 1);
        } else {
            inGarageMap.put(car, 1);
        }
    }

    public boolean exitCar(Car car) {
        if (inGarageMap.containsKey(car) && inGarageMap.get(car) >= 1) {
            inGarageMap.put(car, inGarageMap.get(car) - 1);
        }
        return false;
    }


    public int numberOfTypeAutoInGarage(Car car) {
        int number = 0;
        for (Map.Entry<Car, Integer> entry : inGarageMap.entrySet( )) {
            if (car.getClass( ).equals(entry.getKey( ).getClass( ))) {
                number += entry.getValue( );
            }
        }
        return number;
    }
}