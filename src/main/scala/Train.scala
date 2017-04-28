import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by 1 on 2017/4/28.
  */
object Train {
  val conf = new SparkConf().setAppName("training").setMaster("local")
  val sc = new SparkContext(conf)


}
