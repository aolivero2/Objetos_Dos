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
    
    public NumeroMixto suma (NumeroMixto f2 , NumeroMixto nm2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2, opnum,opdenom,denom,denom2, nm;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=nm2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*denom2+num2*denom);
        opdenom=(denom*denom2);
        nm=(this.numeromixto+nm2.numeromixto);
        f = new NumeroMixto (opnum,opdenom,nm);
        return f;
    }
    public NumeroMixto resta (NumeroMixto f2 , NumeroMixto nm2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2, opnum,opdenom,denom,denom2, nm;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=nm2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*denom2-num2*denom);
        opdenom=(denom*denom2);
        nm=(this.numeromixto-nm2.numeromixto);
        f = new NumeroMixto (opnum,opdenom,nm);
        return f; 
    }
    public NumeroMixto multiplicacion (NumeroMixto f2 , NumeroMixto nm2) throws DenomCeroException{
        NumeroMixto f;
        int num,num2,n, opnum,opdenom,denom,denom2, nm;
        num=this.numeromixto*this.denominador+this.numerador;
        denom=this.denominador;
        num2=nm2.numeromixto*f2.denominador+f2.numerador;
        denom2=f2.denominador;
        opnum=(num*num2);
        opdenom=(denom*denom2);
        nm=(opnum/opdenom);
        n=(opnum % opdenom);
        f = new NumeroMixto (n,opdenom,nm);
        return f;
    }
    
}
