package one.digitalinnovation.beerstock.exception;

public class BeerStockBellowMinimum extends RuntimeException{
    public BeerStockBellowMinimum(){
        super("Beer Stock cant be negative");
    }
}
