package com.fasterxml.jackson.databind;


import java.io.*;
import java.net.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that the "Native" java type
 * mapper can properly serialize Java core objects to JSON.
 *
 * @author Scott Dixon
 */
public class TestObjectMapperBeanSerializer
    extends BaseTest
{
    /**
     * Sanity test to ensure the pieces all work when put together.
     */
    

    private static enum EFixtureEnum
    {
        THIS_IS_AN_ENUM_VALUE_0,
        THIS_IS_AN_ENUM_VALUE_1,
        THIS_IS_AN_ENUM_VALUE_2,
        THIS_IS_AN_ENUM_VALUE_3,
    }

    @SuppressWarnings("unused")
    private static class FixtureObjectBase
    {
        public static final String       VALUE_STRING = "foobar";
        public static final EFixtureEnum VALUE_ENUM   = EFixtureEnum.THIS_IS_AN_ENUM_VALUE_2;
        public static final int          VALUE_INT    = Integer.MIN_VALUE;
        public static final long         VALUE_LONG   = Long.MIN_VALUE;
        public static final BigInteger   VALUE_BIGINT = new BigInteger((new Long(Long.MAX_VALUE)).toString());
        public static final BigDecimal   VALUE_BIGDEC = new BigDecimal((new Double(Double.MAX_VALUE)).toString());
        // this is not necessarily a good char to check
        public static final char         VALUE_CHAR   = Character.MAX_VALUE;
        public static final short        VALUE_SHORT  = Short.MAX_VALUE;
        public static final byte         VALUE_BYTE   = Byte.MAX_VALUE;
        public static final float        VALUE_FLOAT  = Float.MAX_VALUE;
        public static final double       VALUE_DBL    = Double.MAX_VALUE;
        public static final String       VALUE_ERRTXT = "This is the message text for the test error.";

        public static final String       VALUE_URSTR  = "http://jackson.codehaus.org/hi?var1=foo%20bar";

        public URL getURL() throws IOException
        {
            return new URL(VALUE_URSTR);
        }

        public URI getURI() throws IOException
        {
            try {
                return new URI(VALUE_URSTR);
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        public String getTestNull()
        {
            return null;
        }
        public String getTestString()
        {
            return VALUE_STRING;
        }
        public boolean getTestBoolean()
        {
            return true;
        }
        public EFixtureEnum getTestEnum()
        {
            return VALUE_ENUM;
        }
        public int getTestInteger()
        {
            return VALUE_INT;
        }
        public long getTestLong()
        {
            return VALUE_LONG;
        }
        public BigInteger getTestBigInteger()
        {
            return VALUE_BIGINT;
        }
        public BigDecimal getTestBigDecimal()
        {
            return VALUE_BIGDEC;
        }
        public char getTestCharacter()
        {
            return VALUE_CHAR;
        }
        public short getTestShort()
        {
            return VALUE_SHORT;
        }
        public byte getTestByte()
        {
            return VALUE_BYTE;
        }
        public float getTestFloat()
        {
            return VALUE_FLOAT;
        }
        public double getTestDouble()
        {
            return VALUE_DBL;
        }
        public StringBuffer getTestStringBuffer()
        {
            return new StringBuffer(VALUE_STRING);
        }
    }

    @SuppressWarnings("unused")
    private static class FixtureObject extends FixtureObjectBase
    {
        public Exception getTestError()
        {
            return new Exception(VALUE_ERRTXT);
        }
    }
}
