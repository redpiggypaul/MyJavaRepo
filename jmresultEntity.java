package com.csv.entity;

import sun.text.resources.cldr.bn.FormatData_bn_IN;

/**
 * Created by zhuhr on 2016/10/15.
 */
public class jmresultEntity {

    private StringBuilder labelName;
    private int sampleNum;
    private int average;
    private int median;
    private int the90line;
    private int the95line;
    private int the99line;
    private int minValue;
    private int maxValue;
    private long errorRate;
    private long thoughput;
    private long kbSec;
    private int metricNum;

    public jmresultEntity()
    {this.labelName=new StringBuilder("sample");
    this.sampleNum=0;
    this.average=0;
    this.median=0;
    this.the90line=0;
    this.the95line=0;
    this.the99line=0;
    this.minValue=0;
    this.maxValue=0;
    this.errorRate=0;
        this.thoughput=0;
        this.kbSec=0;
        this.metricNum=12;
    }

    public boolean setLabelName (StringBuilder ext) throws Exception
    {
        boolean result = false;
        try{
            this.labelName = new StringBuilder(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setSampleNum (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.sampleNum = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setAverage (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.average = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setMedian (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.median = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean set90Line (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.the90line = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean set95Line (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.the95line = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean set99Line (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.the99line = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setMin (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.minValue = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setMax (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.maxValue = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setErrorRate (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.errorRate = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setThoughput (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.thoughput = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public boolean setKB (int ext) throws Exception
    {
        boolean result = false;
        try{
            this.kbSec = new Integer(ext);
            result = true;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
        finally {
            return result;
        }
    }

    public int getMetricNum () throws Exception {
        try {
            return  this.metricNum;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public StringBuilder  getLabelName () throws Exception {
        try {
            return this.labelName;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public int getAverage () throws Exception {
        try {
            return this.average;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }



    public int getMedian () throws Exception {
        try {
            return this.median;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public int get90Line () throws Exception {
        try {
            return this.the90line;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public int get95Line () throws Exception {
        try {
            return this.the95line;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public int get99Line () throws Exception {
        try {
            return this.the99line;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public int getMin () throws Exception {
        try {
            return this.minValue;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }

    public int getMax () throws Exception {
        try {
            return this.maxValue;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }


    public long getErrorRate () throws Exception {
        try {
            return this.errorRate;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }

    public long getThoughput () throws Exception {
        try {
            return this.thoughput;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }




    public long getKB () throws Exception {
        try {
            return this.kbSec;
        }
        catch (Exception e)
        {
            throw  new NullPointerException("failed to get the jmresultEntity instance");
        }
    }
}
