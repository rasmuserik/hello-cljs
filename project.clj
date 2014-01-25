(defproject hello "0.1.0-SNAPSHOT"
  :description "sample/experimental clojurescript app"
  :url "http://github.com/rasmuserik/hello-cljs"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [sablono "0.2.3"]
                 [om "0.2.3"]
                 [com.facebook/react "0.8.0.1"]]

  :plugins [[lein-cljsbuild "1.0.1"]]

  :source-paths ["src"]

  :cljsbuild { 
    :builds [{:id "hello"
              :source-paths ["src"]
              :compiler {
                ;:target :nodejs
                :output-dir "target"
                :output-to "target/hello.js"
                :optimizations :none
                ;:optimizations :advanced
                :source-map true}}]})
