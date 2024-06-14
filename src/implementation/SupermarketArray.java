package implementation;

public class SupermarketArray implements Supermarket{

    private final String[] items;

    private int lastIndex;

    public SupermarketArray(final int size) {
        this.items = new String[size];
        lastIndex = -1;
    }


    @Override
    public void add(String item) {
        if(lastIndex == items.length -1){
            System.err.println("Lista de supermercado cheia");
        } else{
            lastIndex++;
            items[lastIndex] = item;
        }

    }

    @Override
    public void print() {

        System.out.println("####################################");
        if(lastIndex < 0){
            System.out.println("Lista vazia");
        }
        for(int i = 0; i <= lastIndex; i++){
            System.out.println((i+1) + " - " + items[i]);
        }
        System.out.println("####################################");

    }

    @Override
    public void delete(int index) {
        if(index >= 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        }else{
            System.err.println("Índice inválido");
        }
    }

    private void shift(final int index) {
        for(int i = index; i < lastIndex; i++){
            items[i] = items[i+1];
        }
    }
}
