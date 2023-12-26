package lab_6;

import java.util.ArrayList;

public class Barn <T extends Data>
{
    private ArrayList<T> arr;
    /**
     * Constructor
     */
    public Barn() {
        arr = new ArrayList<T>();
    }

    /**
     * Method simulates finding the largest information
     */
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }

    /**
     * Method simulates adding data
     */
    public void AddData(T data)
    {
        arr.add(data);
        System.out.print("Element added: ");
        data.print();
    }

    /**
     * Method simulates deleting data
     */
    public void DeleteData(int i)
    {
        arr.remove(i);
    }
}
