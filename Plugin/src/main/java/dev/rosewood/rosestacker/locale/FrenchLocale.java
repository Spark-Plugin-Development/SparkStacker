package dev.rosewood.rosestacker.locale;

import dev.rosewood.guiframework.framework.util.GuiUtil;
import dev.rosewood.rosegarden.locale.Locale;
import dev.rosewood.rosestacker.RoseStacker;
import dev.rosewood.rosestacker.manager.ConversionManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrenchLocale implements Locale {

    @Override
    public String getLocaleName() {
        return "fr_FR";
    }

    @Override
    public String getTranslatorName() {
        return "Aartwix";
    }

    @Override
    public Map<String, Object> getDefaultLocaleValues() {
        return new LinkedHashMap<String, Object>() {{
            this.put("#0", "Préfixe du Message du Plugin");
            this.put("prefix", "&7[<g:#8A2387:#E94057:#F27121>RoseStacker&7] ");

            this.put("#1", "Stack Display Tags");
            this.put("entity-stack-display", "&c%amount%x &7%name%");
            this.put("entity-stack-display-custom-name", "%name% &7[&c%amount%x&7]");
            this.put("entity-stack-display-spawn-egg", "&c%amount%x &7%name% Oeuf");
            this.put("item-stack-display", "&c%amount%x &7%name%");
            this.put("item-stack-display-single", "&7%name%");
            this.put("block-stack-display", "&c%amount%x &7%name%");
            this.put("spawner-stack-display", "&c%amount%x &7%name%");
            this.put("spawner-stack-display-single", "&7%name%");

            this.put("#2", "Message de commande de base");
            this.put("base-command-color", "&e");
            this.put("base-command-help", "&eUtilisez &b/rs help &epour les informations de commande.");

            this.put("#3", "Commande d'Aide");
            this.put("command-help-description", "&8 - &d/rs help &7- Affiche le menu d'aide... Vous y êtes arrivé");
            this.put("command-help-title", "&eCommandes Disponibles:");

            this.put("#4", "Commande de rechargement");
            this.put("command-reload-description", "&8 - &d/rs reload &7- Recharge le plugin");
            this.put("command-reload-reloaded", "&eLes fichiers de données, de configuration et de paramètres régionaux du plugin ont été rechargés.");

            this.put("#5", "Commande de don");
            this.put("command-give-description", "&8 - &d/rs give &7- Donner des articles pré-empilés");
            this.put("command-give-usage", "&cUtilisation: &e/rs give <block|générateur|entité> <joueur> <type> [taille] [nombre]");
            this.put("command-give-given", "&eDonné &b%player% &e[%display%&e].");
            this.put("command-give-given-multiple", "&eDonné &b%player% &e%amount%x [%display%&e].");
            this.put("command-give-unstackable", "&cLe type que vous avez spécifié n'est pas empilable.");
            this.put("command-give-too-large", "&cLa quantité que vous avez spécifiée dépasse la taille de pile maximale pour ce type.");

            this.put("#6", "Commande de nettoyage");
            this.put("command-clearall-description", "&8 - &d/rs clearall &7- Efface tout d'un type de pile");
            this.put("command-clearall-killed-entities", "&e&b%amount% &epiles d'entités supprimées.");
            this.put("command-clearall-killed-items", "&e&b%amount% &epiles d'objets supprimées.");
            this.put("command-clearall-killed-all", "&e &b%entityAmount% &epiles d'entités et &b%itemAmount% &epiles d'objets supprimées.");

            this.put("#7", "Commande de statistiques");
            this.put("command-stats-description", "&8 - &d/rs stats &7- Affiche les statistiques sur le plugin");
            this.put("command-stats-header", "&aStatistiques du plugin actuel:");
            this.put("command-stats-threads", "&b%amount% &ethreads d'empilement actifs.");
            this.put("command-stats-stacked-entities", "&b%stackAmount% &epiles d'entités chargées, totalisant &b%total% &eentités.");
            this.put("command-stats-stacked-items", "&b%stackAmount% &epiles d'objets chargés, totalisant &b%total% &eobjets.");
            this.put("command-stats-stacked-blocks", "&b%stackAmount% &epiles de blocs chargées, totalisant &b%total% &eblocks.");
            this.put("command-stats-stacked-spawners", "&b%stackAmount% &epiles de générateurs chargées, totalisant &b%total% &egénérateurs.");

            this.put("#8", "Convertir la commande");
            this.put("command-convert-description", "&8 - &d/rs convert &7- Convertit les données d'un autre plugin d'empilement");
            this.put("command-convert-converted", "&eDonnées converties de &b%plugin% &evers RoseStacker. Le plugin converti a été désactivé. Assurez-vous de supprimer le plugin converti de votre dossier plugins.");
            this.put("command-convert-failed", "&cÉchec de la conversion de &b%plugin%&c, le plugin n'est pas activé.");
            this.put("command-convert-aborted", "&cAbandon de la tentative de conversion de &b%plugin%&c. Vous avez déjà converti à partir d'un autre plugin d'empilement.");

            this.put("#9", "Commande de traduction");
            this.put("command-translate-description", "&8 - &d/rs translate &7- Traduit les noms de pile");
            this.put("command-translate-loading", "&eLe téléchargement et l'application des données de traduction peuvent prendre un moment.");
            this.put("command-translate-failure", "&cImpossible de traduire les noms de pile. Un problème est survenu lors de la récupération des données régionales. Veuillez réessayer plus tard.");
            this.put("command-translate-invalid-locale", "&cImpossible de traduire les noms de pile. Le paramètre régional que vous avez spécifié n'est pas valide.");
            this.put("command-translate-spawner-format", "&eLes noms des générateurs ne peuvent pas être traduits avec précision. Pour résoudre ce problème, vous pouvez utiliser &b/rs translate fr_fr &3{} " +
                    "Générateur &epour qu'un générateur apparaisse comme \"Spawner à Vaches\". Utilisez &b{} &epour le nom de l'entité.");
            this.put("command-translate-spawner-format-invalid", "&cLe format de générateur que vous avez fourni n'est pas valide. Il doit contenir &b{} &cpour le placement du nom de l'entité.");
            this.put("command-translate-success", "&aTraduction des noms de pile avec succès.");

            this.put("#10", "Commande d'outil d'empilage");
            this.put("command-stacktool-description", "&8 - &d/rs stacktool &7- Donne à un joueur l'outil d'empilement");
            this.put("command-stacktool-given", "&eVous avez reçu l'outil d'empilage.");
            this.put("command-stacktool-given-other", "&b%player% &aa reçu l'outil d'empilage.");
            this.put("command-stacktool-no-permission", "&cVous n'êtes pas autorisé à utiliser l'outil d'empilage.");
            this.put("command-stacktool-invalid-entity", "&cCette entité ne fait pas partie d'une pile, est-ce une entité personnalisée ?");
            this.put("command-stacktool-marked-unstackable", "&eLe &b%type% &e a été marqué comme &cinempilable&e.");
            this.put("command-stacktool-marked-stackable", "&eLe &b%type% &ea été marqué comme &aempilable&e.");
            this.put("command-stacktool-marked-all-unstackable", "&eL'ensemble &b%type% &ede pile a été marqué comme &cinempilable&e.");
            this.put("command-stacktool-select-1", "&eLe &b%type% &ea été sélectionné comme Entité #1. Sélectionnez une autre entité pour tester si elles peuvent s'empiler.");
            this.put("command-stacktool-unselect-1", "&eLe &b%type% &ea été désélectionné.");
            this.put("command-stacktool-select-2", "&eLe &b%type% &ea été sélectionné comme Entité #2.");
            this.put("command-stacktool-can-stack", "&aL'entité n°1 peut s'empiler avec l'entité n°2.");
            this.put("command-stacktool-can-not-stack", "&cL'entité 1 ne peut pas se cumuler avec l'entité 2. Raison: &b%reason%");
            this.put("command-stacktool-info", "&eInformations sur la pile:");
            this.put("command-stacktool-info-uuid", "&eUUID: &b%uuid%");
            this.put("command-stacktool-info-entity-id", "&eIdentifiant de l'entité: &b%id%");
            this.put("command-stacktool-info-custom-name", "&eNom d'usage: &r%name%");
            this.put("command-stacktool-info-location", "&eEmplacement: X: &b%x% &eY: &b%y% &eZ: &b%z% &eMonde: &b%world%");
            this.put("command-stacktool-info-chunk", "&eChunk: &b%x%&e, &b%z%");
            this.put("command-stacktool-info-true", "&atrue");
            this.put("command-stacktool-info-false", "&cfalse");
            this.put("command-stacktool-info-entity-type", "&eType d'entité: &b%type%");
            this.put("command-stacktool-info-entity-stackable", "&eEmpilable: %value%");
            this.put("command-stacktool-info-entity-has-ai", "&A l'IA: %value%");
            this.put("command-stacktool-info-entity-from-spawner", "&eCréé par générateur: %value%");
            this.put("command-stacktool-info-item-type", "&eType d'objet: &b%type%");
            this.put("command-stacktool-info-block-type", "&eType de block: &b%type%");
            this.put("command-stacktool-info-spawner-type", "&eType de générateur: &b%type%");
            this.put("command-stacktool-info-stack-size", "&eTaille de la pile: &b%amount%");

            this.put("#11", "GUI de bloc empilé");
            this.put("gui-stacked-block-title", "Modification de la pile %name%");
            this.put("gui-stacked-block-page-back", Collections.singletonList("&ePage précédente (" + GuiUtil.PREVIOUS_PAGE_NUMBER_PLACEHOLDER + "/" + GuiUtil.MAX_PAGE_NUMBER_PLACEHOLDER + ")"));
            this.put("gui-stacked-block-page-forward", Collections.singletonList("&ePage suivante (" + GuiUtil.NEXT_PAGE_NUMBER_PLACEHOLDER + "/" + GuiUtil.MAX_PAGE_NUMBER_PLACEHOLDER + ")"));
            this.put("gui-stacked-block-destroy", Arrays.asList("&cDétruire la pile", "&eDétruit la pile et laisse tomber les objets"));
            this.put("gui-stacked-block-destroy-title", "Détruire la pile de blocs?");
            this.put("gui-stacked-block-destroy-confirm", Arrays.asList("&aConfirmer", "&eOui, détruisez la pile"));
            this.put("gui-stacked-block-destroy-cancel", Arrays.asList("&cAnnuler", "&eNon, revenir à l'écran précédent"));

            this.put("#12", "GUI du générateur empilé");
            this.put("gui-stacked-spawner-title", "Affichage %name%");
            this.put("gui-stacked-spawner-stats", "&6Statistiques des générateurs");
            this.put("gui-stacked-spawner-min-spawn-delay", "&eDélai d'apparition minimum: &b%delay%");
            this.put("gui-stacked-spawner-max-spawn-delay", "&eDélai d'apparition maximum: &b%delay%");
            this.put("gui-stacked-spawner-disabled-mob-ai", "&eIA de l'entité désactivé: &b%disabled%");
            this.put("gui-stacked-spawner-entity-search-range", "&ePlage de recherche d'entité: &b%range%");
            this.put("gui-stacked-spawner-player-activation-range", "&ePlage d'activation du joueur: &b%range%");
            this.put("gui-stacked-spawner-spawn-range", "&ePortée d'apparition: &b%range%");
            this.put("gui-stacked-spawner-min-spawn-amount", "&eMontant d'apparition minimum: &b%amount%");
            this.put("gui-stacked-spawner-max-spawn-amount", "&eMontant max d'apparition: &b%amount%");
            this.put("gui-stacked-spawner-spawn-amount", "&eMontant d'apparition: &b%amount%");
            this.put("gui-stacked-spawner-spawn-conditions", "&6Conditions d'apparition");
            this.put("gui-stacked-spawner-time-until-next-spawn", "&eTemps jusqu'au prochain spawn: &b%time% ticks");
            this.put("gui-stacked-spawner-total-spawns", "&eNombre total de monstres générés: &b%amount%");
            this.put("gui-stacked-spawner-valid-spawn-conditions", "&6Conditions d'apparition valides");
            this.put("gui-stacked-spawner-invalid-spawn-conditions", "&6Conditions d'apparition invalides");
            this.put("gui-stacked-spawner-entities-can-spawn", "&aLes entités peuvent apparaître");
            this.put("gui-stacked-spawner-conditions-preventing-spawns", "&eConditions empêchant les spawns:");

            this.put("#13", "Messages de condition d'apparition");
            this.put("spawner-condition-invalid", "&7 - &c%message%");
            this.put("spawner-condition-info", "&e%condition%");
            this.put("spawner-condition-single", "&e%condition%: &b%value%");
            this.put("spawner-condition-list", "&e%condition%:");
            this.put("spawner-condition-list-item", "&7 - &b%message%");
            this.put("spawner-condition-above-sea-level-info", "Au dessus du niveau de la mer");
            this.put("spawner-condition-above-sea-level-invalid", "Pas de zone d'apparition au-dessus du niveau de la mer");
            this.put("spawner-condition-above-y-axis-info", "Au-dessus de l'axe Y");
            this.put("spawner-condition-above-y-axis-invalid", "Aucune zone d'apparition au-dessus de l'axe Y requis");
            this.put("spawner-condition-air-info", "Plein air");
            this.put("spawner-condition-air-invalid", "Pas d'espaces d'air assez grands disponibles");
            this.put("spawner-condition-below-sea-level-info", "Dessous du niveau de la mer");
            this.put("spawner-condition-below-sea-level-invalid", "Pas de zone d'apparition sous le niveau de la mer");
            this.put("spawner-condition-below-y-axis-info", "Au-dessous de l'axe Y");
            this.put("spawner-condition-below-y-axis-invalid", "Aucune zone d'apparition en dessous de l'axe Y requis");
            this.put("spawner-condition-biome-info", "Biome");
            this.put("spawner-condition-biome-invalid", "Biome incorrect");
            this.put("spawner-condition-block-info", "Bloc d'apparition");
            this.put("spawner-condition-block-invalid", "Aucun bloc d'apparition valide");
            this.put("spawner-condition-block-exception-info", "Exception de blocage de spawn");
            this.put("spawner-condition-block-exception-invalid", "Blocs de réapparition exclus");
            this.put("spawner-condition-darkness-info", "Faible niveau de luminosité");
            this.put("spawner-condition-darkness-invalid", "La zone est trop lumineuse");
            this.put("spawner-condition-fluid-info", "Nécessite du fluide");
            this.put("spawner-condition-fluid-invalid", "Pas de fluide à proximité");
            this.put("spawner-condition-lightness-info", "Niveau de luminosité élevé");
            this.put("spawner-condition-lightness-invalid", "La zone est trop sombre");
            this.put("spawner-condition-max-nearby-entities-info", "Nombre maximal d'entités à proximité");
            this.put("spawner-condition-max-nearby-entities-invalid", "Trop d'entités à proximité");
            this.put("spawner-condition-no-skylight-access-info", "Pas d'accès à la lumière du ciel");
            this.put("spawner-condition-no-skylight-access-invalid", "Pas de blocs d'apparition sans accès à la lumière du ciel");
            this.put("spawner-condition-on-ground-info", "Sur le sol");
            this.put("spawner-condition-on-ground-invalid", "Pas de terrain solide à proximité");
            this.put("spawner-condition-skylight-access-info", "Accès à la lumière du ciel");
            this.put("spawner-condition-skylight-access-invalid", "Pas de blocs d'apparition avec accès à la lucarne");
            this.put("spawner-condition-none-invalid", "Tentatives d'apparition maximales dépassées");
            this.put("spawner-condition-not-player-placed-invalid", "Doit être placé par un joueur");

            this.put("#14", "Connaissance de l'objet de pile donné");
            this.put("#15", "Remarque : Cela apparaîtra dans la tradition des éléments donnés à partir de la commande '/rs give'");
            this.put("stack-item-lore-spawner", new ArrayList<>());
            this.put("stack-item-lore-block", new ArrayList<>());
            this.put("stack-item-lore-entity", new ArrayList<>());

            this.put("#16", "Messages ACF-Core");
            this.put("acf-core-permission-denied", "&cVous n'en avez pas l'autorisation !");
            this.put("acf-core-permission-denied-parameter", "&cVous n'en avez pas l'autorisation !");
            this.put("acf-core-error-generic-logged", "&cUne erreur s'est produite. Veuillez signaler à l'auteur du plugin.");
            this.put("acf-core-error-performing-command", "&cUne erreur s'est produite lors de l'exécution de la commande.");
            this.put("acf-core-unknown-command", "&cCommande inconnue. Utilisez &b/rs&c pour les commandes.");
            this.put("acf-core-invalid-syntax", "&cUtilisation: &e{command}&e {syntax}");
            this.put("acf-core-error-prefix", "&cErreur: {message}");
            this.put("acf-core-info-message", "&e{message}");
            this.put("acf-core-please-specify-one-of", "&cErreur : Un argument non valide a été fourni.");
            this.put("acf-core-must-be-a-number", "&cErreur: &b{num}&c doit être un nombre.");
            this.put("acf-core-must-be-min-length", "&cErreur: doit comporter au moins &b{min}&c caractères.");
            this.put("acf-core-must-be-max-length", "&cErreur: doit comporter au plus &b{max}&c caractères.");
            this.put("acf-core-please-specify-at-most", "&cErreur: Veuillez spécifier une valeur d'au plus&b{max}&c.");
            this.put("acf-core-please-specify-at-least", "&cErreur: Veuillez spécifier une valeur d'au moins &b{min}&c.");
            this.put("acf-core-not-allowed-on-console", "&cSeuls les joueurs peuvent exécuter cette commande.");
            this.put("acf-core-could-not-find-player", "&cErreur: Impossible de trouver un joueur par le nom : &b{search}");
            this.put("acf-core-no-command-matched-search", "&cErreur: Aucune commande ne correspond &b{search}&c.");

            this.put("#17", "Messages ACF-Minecraft");
            this.put("acf-minecraft-no-player-found-server", "&cErreur: Impossible de trouver un joueur par le nom: &b{search}");
            this.put("acf-minecraft-is-not-a-valid-name", "&cErreur: &b{name} &cn'est pas un nom de joueur valide.");

            this.put("#18", "Convertir les messages de verrouillage");
            this.put("convert-lock-conflictions", "&cIl existe des plugins sur votre serveur qui sont connus pour entrer en conflit avec RoseStacker. " +
                    "Afin d'éviter les conflits et/ou la perte de données, RoseStacker a désactivé un ou plusieurs types de pile. " +
                    "Un fichier a été créé à plugins/" + RoseStacker.getInstance().getName() + "/" + ConversionManager.FILE_NAME + " où vous pouvez configurer les types de pile désactivés. " +
                    "Ce fichier vous permettra également de reconnaître que vous avez lu cet avertissement et de désactiver ce message.");

            this.put("#19", "Messages divers");
            this.put("spawner-silk-touch-protect", "&cAvertissement! &eVous devez utiliser une pioche Toucher de soie et/ou avoir la permission de ramasser des générateurs. Vous ne pourrez pas le faire autrement.");
            this.put("spawner-advanced-place-no-permission", "&cAvertissement! &eVous n'êtes pas autorisé à placer ce type de générateur.");
            this.put("spawner-advanced-break-no-permission", "&cAvertissement! &eVous n'êtes pas autorisé à récupérer ce type de générateur.");
            this.put("spawner-advanced-break-silktouch-no-permission", "&cAvertissement! &eVous devez utiliser une pioche Toucher de soie pour ramasser ce type de générateur.");
            this.put("spawner-convert-not-enough", "&cAvertissement! &eImpossible de convertir les générateurs à l'aide d'œufs de spawn. Vous ne tenez pas assez d'œufs d'apparition pour effectuer cette conversion.");
            this.put("number-separator", ",");
        }};
    }
}
