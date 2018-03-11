(ns leiningen.new.dynamic-quil
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "dynamic-quil"))

(defn dynamic-quil
  "Generates a project using quil, suitable for programming from the REPL"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' dynamic-quil project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/{{sanitized}}/dynamic.clj" (render "dynamic.clj" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ["README.md" (render "README.md" data)]
             )))
