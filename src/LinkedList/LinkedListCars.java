package LinkedList;

import java.util.LinkedList;

public class LinkedListCars<S> {
    public static void main(String[] args){
        /*
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast
         */
        LinkedList<String> cars = new LinkedList<>();
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Porsche");
        System.out.println(cars);

        //Incluindo Ferrari no inicio
        cars.addFirst("Ferrari");
        System.out.println(cars);

        //Incluindo Bugatti no fim
        cars.addLast("Bugatti");
        System.out.println(cars);

        //Saber qual carro está na posição 3
        String carro;
        carro = cars.get(3);
        System.out.println(carro);

        //Removendo o primeiro
        cars.removeFirst();
        System.out.println(cars);

        //Removendo o Último
        cars.removeLast();
        System.out.println(cars);

        //Pegar o primeiro
        System.out.println(cars.getFirst());
        System.out.println(cars);

        //Pegar o Ultimo
        System.out.println(cars.getLast());
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
        if(cars.isEmpty()){
            System.out.println("LinkedList está vazio");
        }
    }
}
