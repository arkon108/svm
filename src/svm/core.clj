(ns svm.core
  (:gen-class))
(require '[clojure.tools.cli :refer [cli]])

(defn -main [& args]
  (let [[opts args banner] (cli args
                                ["-h" "--help" "Print this help" :default false :flag true]
                                ["-p" "--port" "App doesn't care about ports"])]
    (when (or (:help opts))
      (println banner))))
