package com.HiveUDF;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

public class ReplaceNum extends UDF {
private Text result = new Text();

public Text evaluate(String str, String str1, String str2) {

String rep = str.replace(str1, str2);
result.set(rep);
return result;

}

}

///home/cloudera/My_Jars/hive-string-rep.jar

// CREATE TEMPORARY FUNCTION repword as 'com.HiveUDF.ReplaceNum';
//CREATE TEMPORARY FUNCTION uppcase as 'com.HiveUDF.ToUpper';
//select repword(ename,'rakesh','suresh') from emp;
//CREATE TEMPORARY FUNCTION uppcase as 'com.HiveUDF.ToUpper';