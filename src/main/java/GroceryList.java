public class GroceryList {
    private String[] arr;

    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }
    
    public void remove(String item) {
        for (int i = 0; i < arr.length; i++) {
            int left = arr.length - (i+1);
            if (arr[i] == item) {
                for (int x=1; x <= left; x++)
                    arr[i+(x-1)] = arr[i+x];
                break;    
            }
        }
    }

    public String toString(){
        String all = "Grocery List: ";
        for (int i = 0; i < arr.length; i++) {
            all = all + arr[i];
            if (i != arr.length-1){
                all = all + "; ";
            }
        }
        return all;
    }
}   