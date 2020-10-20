import java.util.ArrayList;
import java.util.List;

public class test implements TestInterface {
    private int size =10;
    List<Integer> list = new ArrayList<Integer>(size);
    @Override
    public void addValue(int value) throws StorageOverflowException {

        if (!list.contains(value)){
            list.add(value);
        }
        if(!isEmpty()) {
            try {
                throw new StorageOverflowException();
            }
            catch (StorageOverflowException e) {

            }
        }
    }

    @Override
    public void removeValue(int value) {
        if (list.contains(value)){
            list.remove(value);
        }
    }

    @Override
    public int sumOfValues() {
        int sum = 0;
        for (int i=0;i<list.size(); i++){
            sum = sum + list.get(i);}
        return sum;
    }


    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public boolean isFull() {
        if(list.size()==size){
        return true;
        }
        return false;
    }


    @Override
    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;

        }
        return false;
    }
}
