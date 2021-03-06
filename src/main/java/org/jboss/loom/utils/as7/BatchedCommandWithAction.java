package org.jboss.loom.utils.as7;

import org.jboss.loom.actions.CliCommandAction;
import org.jboss.as.cli.batch.BatchedCommand;
import org.jboss.as.cli.batch.impl.DefaultBatchedCommand;
import org.jboss.dmr.ModelNode;

/**
 *
 * @author Ondrej Zizka, ozizka at redhat.com
 */
public class BatchedCommandWithAction extends DefaultBatchedCommand {
    
    final CliCommandAction action;


    public BatchedCommandWithAction( CliCommandAction action, String command, ModelNode request ) {
        super( command, request );
        this.action = action;
    }

    public BatchedCommandWithAction( CliCommandAction action, BatchedCommand cmd ) {
        super( cmd.getCommand(), cmd.getRequest() );
        this.action = action;
    }


    public CliCommandAction getAction() {
        return action;
    }


    @Override
    public String toString() {
        return "BatchedCommandWithAction{" + this.getCommand() + "; action: " + action + '}';
    }
    
    
    
}// class
