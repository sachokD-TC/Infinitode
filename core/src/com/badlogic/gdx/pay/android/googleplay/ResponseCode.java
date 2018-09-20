package com.badlogic.gdx.pay.android.googleplay;

public enum ResponseCode {
    BILLING_RESPONSE_RESULT_OK(0, "Success"),
    BILLING_RESPONSE_RESULT_USER_CANCELED(1, "User pressed back or canceled a dialog"),
    BILLING_RESPONSE_RESULT_SERVICE_UNAVAILABLE(2, "Network connection is down"),
    BILLING_RESPONSE_RESULT_BILLING_UNAVAILABLE(3, "Billing API version is not supported for the type requested"),
    BILLING_RESPONSE_RESULT_ITEM_UNAVAILABLE(4, "Requested product is not available for purchase"),
    BILLING_RESPONSE_RESULT_DEVELOPER_ERROR(5, "Invalid arguments provided to the API. This error can also indicate that the application was not correctly signed or properly set up for In-app Billing in Google Play, or does not have the necessary permissions in its manifest"),
    BILLING_RESPONSE_RESULT_ERROR(6, "Fatal error during the API action"),
    BILLING_RESPONSE_RESULT_ITEM_ALREADY_OWNED(7, "Failure to purchase since item is already owned"),
    BILLING_RESPONSE_RESULT_ITEM_NOT_OWNED(8, "Failure to consume since item is not owned");
    
    private int code;
    private String message;

    private ResponseCode(int i, String str) {
        this.code = i;
        this.message = str;
    }

    /* renamed from: a */
    public static ResponseCode m1794a(int i) {
        for (ResponseCode responseCode : values()) {
            if (i == responseCode.code) {
                return responseCode;
            }
        }
        return null;
    }

    public final String toString() {
        return "ResponseCode{code=" + this.code + ", message='" + this.message + '\'' + '}';
    }
}
