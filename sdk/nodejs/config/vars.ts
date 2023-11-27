// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

declare var exports: any;
const __config = new pulumi.Config("btp");

/**
 * The URL of the BTP CLI server (e.g. `https://cli.btp.cloud.sap`).
 */
export declare const cliServerUrl: string | undefined;
Object.defineProperty(exports, "cliServerUrl", {
    get() {
        return __config.get("cliServerUrl");
    },
    enumerable: true,
});

/**
 * The subdomain of the global account in which you want to manage resources. To be found in the cockpit, in the global
 * account view.
 */
export declare const globalaccount: string | undefined;
Object.defineProperty(exports, "globalaccount", {
    get() {
        return __config.get("globalaccount");
    },
    enumerable: true,
});

/**
 * The identity provider to be used for authentication (default: SAP ID service with origin `sap.default`).
 */
export declare const idp: string | undefined;
Object.defineProperty(exports, "idp", {
    get() {
        return __config.get("idp");
    },
    enumerable: true,
});

/**
 * A valid id token. To be provided instead of 'username' and 'password'. This can also be sourced from the `BTP_IDTOKEN`
 * environment variable. (SAP-internal usage only)
 */
export declare const idtoken: string | undefined;
Object.defineProperty(exports, "idtoken", {
    get() {
        return __config.get("idtoken");
    },
    enumerable: true,
});

/**
 * Your password. Note that two-factor authentication is not supported. This can also be sourced from the `BTP_PASSWORD`
 * environment variable.
 */
export declare const password: string | undefined;
Object.defineProperty(exports, "password", {
    get() {
        return __config.get("password");
    },
    enumerable: true,
});

/**
 * PEM encoded certificate (only required for x509 auth).
 */
export declare const tlsClientCertificate: string | undefined;
Object.defineProperty(exports, "tlsClientCertificate", {
    get() {
        return __config.get("tlsClientCertificate");
    },
    enumerable: true,
});

/**
 * PEM encoded private key (only required for x509 auth).
 */
export declare const tlsClientKey: string | undefined;
Object.defineProperty(exports, "tlsClientKey", {
    get() {
        return __config.get("tlsClientKey");
    },
    enumerable: true,
});

/**
 * The URL of the identity provider to be used for authentication (only required for x509 auth).
 */
export declare const tlsIdpUrl: string | undefined;
Object.defineProperty(exports, "tlsIdpUrl", {
    get() {
        return __config.get("tlsIdpUrl");
    },
    enumerable: true,
});

/**
 * Your user name, usually an e-mail address. This can also be sourced from the `BTP_USERNAME` environment variable.
 */
export declare const username: string | undefined;
Object.defineProperty(exports, "username", {
    get() {
        return __config.get("username");
    },
    enumerable: true,
});

