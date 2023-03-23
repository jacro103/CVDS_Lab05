package edu.eci.cvds.servlet.model;
import java.util.Random;

public class GuessBean {

    private int premio;
    private int intentos;
    private int numeroAdivinar;
    private boolean gano;
    private String estado;
    private int numero;


    public void guessBean(){
        while (gano) {
            if(numeroAdivinar == numero){
                estado = "Gano";
                premio = 100000;
                gano = true;
            }
            else{
                premio -= 10000;
                estado = "Sin Ganador";
            }

          }

    }
    public  GuessBean(){
        Random random =new Random();
        numeroAdivinar= random.nextInt(100);
        premio = 100000;
        estado = "comienza el juego";
        gano = false;
        intentos = 0;
    }
    public int  getpremio(){
        return this.premio;
    }
    public int  getnumeroAdivinar(){
        return this.numeroAdivinar;
    }
    public boolean  getgano(){
        return this.gano;
    }
    public String  getestado(){
        return this.estado;
    }
    public int  getintentos(){
        return this.intentos;
    }
    public int  getnumero(){
        return this.numero;
    }
    public int  setpremio(int premios){
        this.premio = premios;
        return this.premio;
    }
    public int  setnumeroAdivinar(int adivinar){
        this.numeroAdivinar = adivinar;
        return this.numeroAdivinar;
    }
    public String  getestado(String estado){
        this.estado = estado;
        return this.estado;
    }
    public int  setintentos(int intento){
        this.intentos= intento;
        return this.intentos;
    }
    public int  setnumero(int numero){
        this.numero= numero;
        return this.numero;
    }


}
