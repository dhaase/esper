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
package com.espertech.esper.common.internal.compile.stage1.spec;

import java.io.Serializable;

/**
 * Describes a column name and type.
 */
public class ColumnDesc implements Serializable {
    private static final long serialVersionUID = -3508097717971934622L;

    private final String name;
    private final String type;

    /**
     * Ctor.
     *
     * @param name column name
     * @param type type
     */
    public ColumnDesc(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Returns column name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Return column type
     *
     * @return type
     */
    public String getType() {
        return type;
    }
}
