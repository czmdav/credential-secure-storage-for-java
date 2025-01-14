// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the project root.

module com.microsoft.credentialstorage {
    requires com.sun.jna;
    requires com.sun.jna.platform;
    requires org.slf4j;

    exports com.microsoft.credentialstorage.model;
    exports com.microsoft.credentialstorage;

    exports com.microsoft.credentialstorage.implementation.posix.internal to com.sun.jna;
    exports com.microsoft.credentialstorage.implementation.posix.keyring to com.sun.jna;
    exports com.microsoft.credentialstorage.implementation.posix.libsecret to com.sun.jna;

    exports com.microsoft.credentialstorage.implementation.windows to com.sun.jna;
}