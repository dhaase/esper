/*
 ***************************************************************************************
 *  Copyright (C) 2006 EsperTech, Inc. All rights reserved.                            *
 *  http://www.espertech.com/esper                                                     *
 *  http://www.espertech.com                                                           *
 *  ---------------------------------------------------------------------------------- *
 *  The software in this package is published under the terms of the GPL license       *
 *  a copy of which has been included with this distribution in the license.txt file.  *
 ***************************************************************************************
 */
package com.espertech.esper.common.internal.epl.rowrecog.nfa;

import com.espertech.esper.common.client.EventBean;
import com.espertech.esper.common.internal.context.util.AgentInstanceContext;

/**
 * The '*' state in the regex NFA states.
 */
public class RowRecogNFAStateZeroToManyEvalNoCond extends RowRecogNFAStateBase {

    public boolean matches(EventBean[] eventsPerStream, AgentInstanceContext agentInstanceContext) {
        return true;
    }

    public String toString() {
        return "ZeroMany-Filtered";
    }
}
