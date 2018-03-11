(ns {{name}}.core
  (:require [quil.core as q])
  (:require [quil.middleware :as m])
  (:require [{{name}}.dynamic :as dynamic])
  )

(q/defsketch {{name}}
  :title "My dynamic Quil sketch"
  :draw dynamic/draw
  :setup dynamic/setup
  :update dynamic/update-state
  :middleware [m/fun-mode]
  :size [500 500])

(defn -main []
  {{name}})
