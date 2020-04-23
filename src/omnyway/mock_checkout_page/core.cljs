(ns omnyway.mock-checkout-page.core
    (:require
     [reagent.core :as reagent]
     [re-frame.core :as re-frame]
     [omnyway.mock-checkout-page.events :as events]
     [omnyway.mock-checkout-page.views :as views]
     [omnyway.mock-checkout-page.config :as config]
     ))


(defn dev-setup []
  (when config/debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
