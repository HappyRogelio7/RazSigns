package me.razorni.dev.handler;

import me.razorni.dev.RazSigns;

public class Handler
{
    private RazSigns instance;
    
    public Handler(final RazSigns instance) {
        this.instance = instance;
    }
    
    public void enable() {
    }
    
    public void disable() {
    }
    
    public RazSigns getInstance() {
        return this.instance;
    }
}
