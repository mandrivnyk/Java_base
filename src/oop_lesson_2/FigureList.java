package oop_lesson_2;



import java.util.Arrays;

public class FigureList {

    public  aFigure[] figuresList = new aFigure[1];


    public void addFigure(aFigure figure){

        if (figuresList[0] == null) {
            figuresList[0]  = figure;
        } else {
            figuresList = Arrays.copyOf(figuresList, figuresList.length + 1); //create new array from old array and allocate one more element
            figuresList[figuresList.length - 1] = figure;
        }

//        System.out.println(Arrays.toString(figuresList));
    }

    public void deleteFigure(int index){
        aFigure[] figuresListNew = Arrays.copyOf(figuresList, figuresList.length -1);
        int y = 0;
        for(int i =0; i<this.figuresList.length; i++){
            if(i != index){
                figuresListNew[y++] = figuresList[i];
            }
        }
        this.figuresList = figuresListNew;
    }

    public aFigure findFigureWithSquare(int minS){
        for (aFigure figure : figuresList) {
            if(figure.getSquare() >10) {
                return figure;
            }
        }
            return null;
        }
    public aFigure findFiguresWithSquare(int minS){


        for (aFigure figure : figuresList) {
            if(figure.getSquare() >10) {
                return figure;
            }
        }
            return null;
        }




}
