package com.library.main;

public class Queue_lib {
    int size;//размер очереди
    int []massiv;
    int versina;//вершина очереди
    int ukazatel;
    int kol_object;
    // Конструктор //Вставка элемента в конец очереди// Извлечение элемента в начале очереди//
    //      +                        +
    //Чтение элемента в начале очереди  //пустота //полнота // Количество элементов в очереди// Распечатать массив//
   //                                                                                                      +
    public Queue_lib(int c){
      size=c;
      massiv=new int[size];
      ukazatel=0;
      kol_object=0;
      versina=0;
    }

    public void add(int k){
               if(kol_object==0){
                   massiv[ukazatel]=k;
                   kol_object=1;
                   ukazatel=0;
                   versina=0;
               }else {
                   massiv[versina+1]=k;
                   kol_object+=1;
                   versina+=1;
               }
    }
    public void pechat() {
        if((ukazatel+kol_object)<=(size-ukazatel+1)) {
        for (int i=0;i<kol_object;i++){
                System.out.println(massiv[i + ukazatel]);
            }
            System.out.println("-------");
        }else{
            for (int i=ukazatel;i<size;i++) {
                System.out.println(massiv[i]);
            }for(int n=0;n<size-(size-ukazatel);n++) {
                System.out.println(massiv[n]);
            }System.out.println("-------");
        }
        }
        //извлечь объект ////Дописать исключения и границы применения!
        public void extend(){
           massiv[ukazatel]=0;
           ukazatel=ukazatel+1;
           kol_object=kol_object-1;
        }
    }

