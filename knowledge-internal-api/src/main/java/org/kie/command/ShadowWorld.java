package org.kie.command;

import org.kie.runtime.ExecutionResults;

public interface ShadowWorld extends World {
    //public ShadowContext createContext(String identifier);
    
    public ShadowContext getContext(String identifier); 
    
    //public ExecutionResults getExecutionResults();
}
