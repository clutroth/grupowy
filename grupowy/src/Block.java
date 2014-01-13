/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deckerw
 */
public class Block {

    private static final int BLOCK_SIZE = 900 * 1024; //rozmiar bloku w kibibajtach
    private byte[] block = new byte[BLOCK_SIZE];
    private int BWTIndex;

    /**
     * @return the BLOCK_SIZE
     */
    public static int getBLOCK_SIZE() {
        return BLOCK_SIZE;
    }

    /**
     * @return the block
     */
    public byte[] getBlock() {
        return block;
    }

    /**
     * @param aBlock the block to set
     */
    public static void setBlock(byte[] aBlock) {
        setBlock(aBlock);
    }

    /**
     * @return the BWTIndex
     */
    public int getBWTIndex() {
        return BWTIndex;
    }

    /**
     * @param BWTIndex the BWTIndex to set
     */
    public void setBWTIndex(int BWTIndex) {
        this.BWTIndex = BWTIndex;
    }
}
