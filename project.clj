(defproject svm "1.0.0"
  :description "Sched Virtual Machine command line interface"
  :url "https://github.com/arkon108/svm"
  :dependencies [[org.clojure/clojure "1.6.0"] [org.clojure/tools.cli "0.3.3"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot :all
  :main svm.core)
