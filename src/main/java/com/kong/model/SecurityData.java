package com.kong.model;

/**
 * Created by Kong on 2018/2/23.
 */
public class SecurityData {

    /**
     * RSA私钥{e,n}中的 n
     *
     * @return
     */
    private byte[] privateKeyModulusBytes;

    /**
     * RSA私钥{e,n}中的 e
     *
     * @return
     */
    private byte[] privateKeyExponentBytes;

    /**
     * RSA公钥{e,n}中的 n, 128位bytes
     *
     * @return
     */
    private byte[] publicKeyModulusBytes;

    /**
     * RSA公钥{e,n}中的 e
     *
     * @return
     */
    private long publicKeyExponent;

    /**
     * 密钥信息
     */
    private byte[] securityKey ;

    public byte[] getPrivateKeyModulusBytes() {
        return privateKeyModulusBytes;
    }

    public void setPrivateKeyModulusBytes(byte[] privateKeyModulusBytes) {
        this.privateKeyModulusBytes = privateKeyModulusBytes;
    }

    public byte[] getPrivateKeyExponentBytes() {
        return privateKeyExponentBytes;
    }

    public void setPrivateKeyExponentBytes(byte[] privateKeyExponentBytes) {
        this.privateKeyExponentBytes = privateKeyExponentBytes;
    }

    public byte[] getPublicKeyModulusBytes() {
        return publicKeyModulusBytes;
    }

    public void setPublicKeyModulusBytes(byte[] publicKeyModulusBytes) {
        this.publicKeyModulusBytes = publicKeyModulusBytes;
    }

    public long getPublicKeyExponent() {
        return publicKeyExponent;
    }

    public void setPublicKeyExponent(long publicKeyExponent) {
        this.publicKeyExponent = publicKeyExponent;
    }

    public byte[] getSecurityKey() {
        return securityKey;
    }

    public void setSecurityKey(byte[] securityKey) {
        this.securityKey = securityKey;
    }
}
