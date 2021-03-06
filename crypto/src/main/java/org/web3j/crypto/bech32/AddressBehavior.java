package org.web3j.crypto.bech32;

public interface AddressBehavior {

    public static final String CHANNLE_PLATON = "PLATON";
    public static final String CHANNLE_LATT = "LATTICEX";


    String channleType();

    AddressBech32 encodeAddress(String address);

    AddressBech32 decodeAddress(String address);
}
