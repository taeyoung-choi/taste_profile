import org.apache.spark.SparkConf
import org.apache.spark.sql.SparkSession


object preprocessing {
  def main(args: Array[String]) = {
    val conf: SparkConf = new SparkConf().setMaster("local[*]").setAppName("taste_profile")
    val spark = SparkSession.builder().config(conf).getOrCreate()
    var music = spark.read.json("src/main/scala/data/reviews_Digital_Music_5.json").select("reviewerID")
    var books = spark.read.json("src/main/scala/data/reviews_Books_5.json").select("reviewerID")

    var joined = music.join(books, "reviewerID")
    println(joined.select("reviewerID").distinct().count())
  }
}
