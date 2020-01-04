package com.dto;

import lombok.Data;

@Data
public class ResponseDTO {
    private String code;
    private String msg;
    private Object data;

    private ResponseDTO(Builder builder) {
        setCode(builder.code);
        setMsg(builder.msg);
        setData(builder.data);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(ResponseDTO copy) {
        Builder builder = new Builder();
        builder.code = copy.getCode();
        builder.msg = copy.getMsg();
        builder.data = copy.getData();
        return builder;
    }


    public static final class Builder {
        private String code;
        private String msg;
        private Object data;

        private Builder() {
        }

        public Builder code(String val) {
            code = val;
            return this;
        }

        public Builder msg(String val) {
            msg = val;
            return this;
        }

        public Builder data(Object val) {
            data = val;
            return this;
        }

        public ResponseDTO build() {
            return new ResponseDTO(this);
        }
    }
}
