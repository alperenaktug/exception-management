package com.alperenaktug.controller.Impl;

import com.alperenaktug.model.RootEntity;

public class RestBaseController {

    public <T>RootEntity<T> ok(T data) {
        return RootEntity.ok(data);
    }

    public <T>RootEntity<T> error(String message) {
        return RootEntity.error(message);
    }
}
