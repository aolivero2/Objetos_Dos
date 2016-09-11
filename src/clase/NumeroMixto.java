/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SERVIDOR
 */
public class NumeroMixto {
    private int numerador;
    private int denominador;
    private int numeromixto;
    
    public NumeroMixto (int numerador, int denominador, int numeromixto) throws DenomCeroException{
        this.numerador=numerador;
        this.denominador=denominador;
        this.numeromixto=numeromixto;
        
        if (denominador == 0){
            throw new DenomCeroException();
        }
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public int getNumeromixto() {
        return numeromixto;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public void setNumeromixto(int numeromixto) {
        this.numeromixto = numeromixto;
    }
    
    public NumeroMixto suma (NumeroMixto f2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2, opnum,opdenom,denom,denom2,nm,denmres,numres;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=f2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*denom2+num2*denom);
        opdenom=(denom*denom2);
        nm=opnum/opdenom;
        numres=opnum%opdenom;
        denmres=opdenom;
        f = new NumeroMixto (numres,denmres,nm);
        return f;
    }
    public NumeroMixto resta (NumeroMixto f2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2, opnum,opdenom,denom,denom2, nm,denmres,numres;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=f2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*denom2-num2*denom);
        opdenom=(denom*denom2);
        nm=opnum/opdenom;
        denmres=opdenom;
        numres=opnum%opdenom;
        f = new NumeroMixto (denmres,numres,nm);
        return f; 
    }
    public NumeroMixto multiplicacion (NumeroMixto f2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2,opnum,opdenom,denom,denom2, nm,denmres,numres;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=f2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*num2);
        opdenom=(denom*denom2);
        denmres=(opdenom);
        nm= (opnum/opdenom);
        numres=(opnum%nm);
        f = new NumeroMixto (denmres,numres,nm);
        return f;
    }
    public NumeroMixto division (NumeroMixto f2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2,opnum,opdenom,denom,denom2, nm,denmres,numres;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=f2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*denom2);
        opdenom=(num2*denom);
        denmres=opdenom;
        nm= (opnum/opdenom);
        numres=(opnum%nm);
        f = new NumeroMixto (denmres,numres,nm);
        return f;
    }
    public NumeroMixto convertirfraccion () throws DenomCeroException{
       NumeroMixto f;
       int num,denm,nm;
       num=this.numeromixto*this.denominador+this.numerador;
       denm=this.denominador;
       nm=this.numeromixto;
       f = new NumeroMixto (num,denm,nm);
       return f;
    }
   
}
