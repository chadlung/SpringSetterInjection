package com.giantflyingsaucer.springsetterinjection;


public class DoSomething {
    
    private String property1;
    private String property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
    
    @Override
    public String toString() {
        return "Property 1 = " + this.property1 + "   Property 2 = " + this.property2;
    }
}
