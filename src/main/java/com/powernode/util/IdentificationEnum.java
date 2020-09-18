package com.powernode.util;

public enum IdentificationEnum {

    BLACK_CIRCLE("黑圈"),
    GREEN_CIRCLE("绿圈"),
    RED_FORK("红叉"),
    BLACK_FORK("黑叉"),
    ANCHOR_POINT("锚点");

    private String indentification;

    IdentificationEnum(String indentification) {
        this.indentification = indentification;
    }

    public String getIndentification() {
        return indentification;
    }
}
