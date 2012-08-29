(ns com.indoles.clj.fanOutMain
  (:gen-class))

(defn -main
  [subcmd & args]
  (let [main-sym (symbol (str subcmd "/-main"))]
    (require (symbol subcmd))
    (apply (eval main-sym) args)))
