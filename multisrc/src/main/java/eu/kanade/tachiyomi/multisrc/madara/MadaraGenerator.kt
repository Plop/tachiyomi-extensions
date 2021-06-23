package eu.kanade.tachiyomi.multisrc.madara

import generator.ThemeSourceData.MultiLang
import generator.ThemeSourceData.SingleLang
import generator.ThemeSourceGenerator

class MadaraGenerator : ThemeSourceGenerator {

    override val themePkg = "madara"

    override val themeClass = "Madara"

    override val baseVersionCode: Int = 7

    override val sources = listOf(
        MultiLang("Leviatan Scans", "https://leviatanscans.com", listOf("en", "es"), className = "LeviatanScansFactory", overrideVersionCode = 4),
        MultiLang("MangaForFree.net", "https://mangaforfree.net",  listOf("en", "ko", "all") , isNsfw = true, className = "MangaForFreeFactory", pkgName = "mangaforfree", overrideVersionCode = 1),
        MultiLang("Manhwa18.cc", "https://manhwa18.cc", listOf("en", "ko", "all"), isNsfw = true, className = "Manhwa18CcFactory", pkgName = "manhwa18cc"),
        SingleLang("1st Kiss Manga.love", "https://1stkissmanga.love", "en", className = "FirstKissMangaLove"),
        SingleLang("1st Kiss Manhua", "https://1stkissmanhua.com", "en", className = "FirstKissManhua", overrideVersionCode = 2),
        SingleLang("1st Kiss", "https://1stkissmanga.com", "en", className = "FirstKissManga", overrideVersionCode = 3),
        SingleLang("1stKissManga.Club", "https://1stkissmanga.club", "en", className = "FirstKissMangaClub"),
        SingleLang("247Manga", "https://247manga.com", "en", className = "Manga247"),
        SingleLang("24hRomance", "https://24hromance.com", "en", className = "Romance24h"),
        SingleLang("365Manga", "https://365manga.com", "en", className = "ThreeSixtyFiveManga", overrideVersionCode = 1),
        SingleLang("AYATOON", "https://ayatoon.com", "tr", overrideVersionCode = 1),
        SingleLang("Ace Scans", "https://acescans.xyz", "en"),
        SingleLang("Adonis Fansub", "https://manga.adonisfansub.com", "tr", overrideVersionCode = 1),
        SingleLang("Agent of Change Translations", "https://aoc.moe", "en", overrideVersionCode = 1),
        SingleLang("AkuManga", "https://akumanga.com", "ar"),
        SingleLang("AllPornComic", "https://allporncomic.com", "en", isNsfw = true),
        SingleLang("Anisa Manga", "https://anisamanga.com", "tr"),
        SingleLang("ApollComics", "https://apollcomics.xyz", "es", overrideVersionCode = 1),
        SingleLang("ArabMkr", "https://arabmkr.me", "ar"),
        SingleLang("Arang Scans", "https://arangscans.com", "en", overrideVersionCode = 3), // removed override
        SingleLang("ArazNovel", "https://www.araznovel.com", "tr", overrideVersionCode = 1),
        SingleLang("Argos Scan", "https://argosscan.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Arthur Scan", "https://arthurscan.xyz", "pt-BR", overrideVersionCode = 1),
        SingleLang("Asgard Team", "https://www.asgard1team.com", "ar", overrideVersionCode = 1),
        SingleLang("Astral Library", "https://www.astrallibrary.net", "en", overrideVersionCode = 2),
        SingleLang("Atikrost", "https://atikrost.com", "tr", overrideVersionCode = 1),
        SingleLang("Azora", "https://azoramanga.com", "ar", overrideVersionCode = 1),
        SingleLang("BL Manhwa Club", "https://blmanhwa.club", "pt-BR", isNsfw = true, className = "BlManhwaClub", overrideVersionCode = 1),
        SingleLang("Bakaman", "https://bakaman.net", "th", overrideVersionCode = 1),
        SingleLang("Banana Mecânica", "https://leitorbm.com", "pt-BR", isNsfw = true, pkgName = "bananamecanica", className = "BananaMecanica", overrideVersionCode = 1),
        SingleLang("BestManga", "https://bestmanga.club", "ru"),
        SingleLang("BestManhua", "https://bestmanhua.com", "en", overrideVersionCode = 2),
        SingleLang("BoysLove", "https://boyslove.me", "en", overrideVersionCode = 1),
        SingleLang("CAT-translator", "https://cat-translator.com", "th", className = "CatTranslator"),
        SingleLang("Café com Yaoi", "http://cafecomyaoi.com.br", "pt-BR", pkgName = "cafecomyaoi", className = "CafeComYaoi", isNsfw = true),
        SingleLang("CatOnHeadTranslations", "https://catonhead.com", "en", overrideVersionCode = 1),
        SingleLang("Cerise Scans", "https://cerisescans.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("Cervo Scanlator", "https://cervoscan.xyz", "pt-BR", overrideVersionCode = 2),
        SingleLang("Chibi Manga", "https://www.cmreader.info", "en", overrideVersionCode = 1),
        SingleLang("Clover Manga", "https://clover-manga.com", "tr", overrideVersionCode = 2),
        SingleLang("ComicKiba", "https://comickiba.com", "en", overrideVersionCode = 1),
        SingleLang("Comicdom", "https://comicdom.org", "en", overrideVersionCode = 1),
        SingleLang("Comichub", "https://comichub.net", "en"),
        SingleLang("Comics Valley", "https://comicsvalley.com", "hi", isNsfw = true),
        SingleLang("ComicsWorld", "https://comicsworld.in", "hi"),
        SingleLang("CopyPasteScan", "https://copypastescan.xyz", "es", overrideVersionCode = 1),
        SingleLang("DarkYue Realm", "https://darkyuerealm.site/web", "pt-BR", pkgName = "darkyurealm", overrideVersionCode = 3),
        SingleLang("Decadence Scans", "https://reader.decadencescans.com", "en", overrideVersionCode = 1),
        SingleLang("DiamondFansub", "https://diamondfansub.com", "tr"),
        SingleLang("Disaster Scans", "https://disasterscans.com", "en", overrideVersionCode = 1),
        SingleLang("DoujinHentai", "https://doujinhentai.net", "es", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Dream Manga", "https://en.ruyamanga.com", "en", overrideVersionCode = 2),
        SingleLang("Drope Scan", "https://dropescan.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Esomanga", "http://esomanga.com", "tr"),
        SingleLang("FDM Scan", "https://fdmscan.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Free Manga", "https://freemanga.me", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("FreeWebtoonCoins", "https://freewebtooncoins.com", "en", overrideVersionCode = 1),
        SingleLang("Fudido Scanlator", "https://fudidoscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Fukushuu no Yuusha", "https://fny-scantrad.com", "fr", overrideVersionCode = 1),
        SingleLang("Furio Scans", "https://furioscans.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Fênix Scanlator", "https://fenixscanlator.xyz", "pt-BR", pkgName = "fenixscanlator", className = "FenixScanlator", overrideVersionCode = 1),
        SingleLang("GalaxyDegenScans", "https://gdegenscans.xyz/", "en", overrideVersionCode = 1),
        SingleLang("Geass Scan", "https://geassscan.xyz", "pt-BR"),
        SingleLang("Glory Scans", "https://gloryscan.com", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Graze Scans", "https://grazescans.com/", "en", overrideVersionCode = 1),
        SingleLang("GuncelManga", "https://guncelmanga.com", "tr"),
        SingleLang("Hades no Fansub", "https://mangareaderpro.com/es", "es"),
        SingleLang("Hades no Fansub Hentai", "https://h.mangareaderpro.com", "es", isNsfw = true),
        SingleLang("Hayalistic", "https://hayalistic.com", "tr"),
        SingleLang("Hentai20", "https://hentai20.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Hentaidexy", "https://hentaidexy.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Hero Manhua", "https://heromanhua.com", "en"),
        SingleLang("Heroz Scanlation", "https://herozscans.com", "en", overrideVersionCode = 1),
        SingleLang("Himera Fansub", "https://himera-fansub.com", "tr"),
        SingleLang("Hiperdex", "https://hiperdex.com", "en", isNsfw = true, overrideVersionCode = 4),
        SingleLang("Hscans", "https://hscans.com", "en", overrideVersionCode = 1),
        SingleLang("Hunter Fansub", "https://hunterfansub.com", "es", overrideVersionCode = 1),
        SingleLang("Hz Manga", "https://www.hzmangas.com", "es"),
        SingleLang("Ichirin No Hana Yuri", "https://ichirinnohanayuri.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("Immortal Updates", "https://immortalupdates.com", "en", overrideVersionCode = 1),
        SingleLang("Imperfect Comics", "https://imperfectcomic.com", "en"),
        SingleLang("Império dos Otakus", "https://imperiodosotakus.tk", "pt-BR", className = "ImperioDosOtakus", overrideVersionCode = 1),
        SingleLang("InfraFandub", "https://infrafandub.xyz", "es"),
        SingleLang("IsekaiScan.com", "https://isekaiscan.com", "en", className = "IsekaiScanCom", overrideVersionCode = 2),
        SingleLang("IsekaiScanManga (unoriginal)", "https://isekaiscanmanga.com", "en", className = "IsekaiScanManga", overrideVersionCode = 1),
        SingleLang("Its Your Right Manhua", "https://itsyourightmanhua.com/", "en", overrideVersionCode = 1),
        SingleLang("JJutsuScans", "https://jjutsuscans.com", "en", overrideVersionCode = 1),
        SingleLang("KisekiManga", "https://kisekimanga.com", "en", overrideVersionCode = 1),
        SingleLang("Kissmanga.in", "https://kissmanga.in", "en", className= "KissmangaIn", overrideVersionCode = 1),
        SingleLang("KlikManga", "https://klikmanga.com", "id", overrideVersionCode = 1),
        SingleLang("Kombatch", "https://kombatch.com", "id"),
        SingleLang("Kun Manga", "https://kunmanga.com", "en", overrideVersionCode = 1),
        SingleLang("Levelerscans", "https://levelerscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("Leviatan Scans X", "https://xxx.leviatanscans.com", "en", isNsfw = true),
        SingleLang("Lily Manga", "https://lilymanga.com", "en"),
        SingleLang("Little Monster Scan", "https://littlemonsterscan.com.br", "pt-BR", overrideVersionCode = 2),
        SingleLang("LovableSubs", "https://lovablesubs.com", "tr"),
        SingleLang("MG Komik", "https://mgkomik.com", "id", overrideVersionCode = 2),
        SingleLang("MMScans", "https://mm-scans.com/", "en", overrideVersionCode = 1),
        SingleLang("Manga Action", "https://manga-action.com", "ar", overrideVersionCode = 1),
        SingleLang("Manga Bin", "https://mangabin.com/", "en", overrideVersionCode = 1),
        SingleLang("Manga Chill", "https://mangachill.com/", "en", overrideVersionCode = 1),
        SingleLang("Manga Clash", "https://mangaclash.com", "en", overrideVersionCode = 2),
        SingleLang("Manga Crab", "https://mangacrab.com", "es"),
        SingleLang("Manga Diyari", "https://manga-diyari.com", "tr", overrideVersionCode = 1),
        SingleLang("Manga Drop Out", "https://www.mangadropout.xyz", "id", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manga Fenix", "https://manga-fenix.com", "es", overrideVersionCode = 1),
        SingleLang("Manga Hentai", "https://mangahentai.me", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Manga Kiss", "https://mangakiss.org", "en", overrideVersionCode = 1),
        SingleLang("Manga Land Arabic", "https://mangalandarabic.com", "ar"),
        SingleLang("Manga Lord", "https://mangalord.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Mitsu", "https://mangamitsu.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Manga Nine", "https://manganine.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Read", "https://mangaread.co", "en", overrideVersionCode = 1),
        SingleLang("Manga Rock Team", "https://mangarockteam.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Rocky", "https://mangarocky.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Sky", "https://mangasky.net", "en"),
        SingleLang("Manga SY", "https://www.mangasy.com", "en", overrideVersionCode = 1),
        SingleLang("Manga Starz", "https://mangastarz.com", "ar"),
        SingleLang("Manga Too", "https://mangatoo.com/", "en", overrideVersionCode = 1),
        SingleLang("Manga Weebs", "https://mangaweebs.in", "en", overrideVersionCode = 1),
        SingleLang("Manga-Online.co", "https://www.manga-online.co", "th", className = "MangaOnlineCo"),
        SingleLang("Manga-Scantrad", "https://manga-scantrad.net", "fr", className = "MangaScantrad", overrideVersionCode = 1),
        SingleLang("Manga18 Fx", "https://manga18fx.com", "en", overrideVersionCode = 1),
        SingleLang("Manga1st", "https://manga1st.com", "en", overrideVersionCode = 1),
        SingleLang("Manga1st.online", "https://manga1st.online", "en", className = "MangaFirstOnline", overrideVersionCode = 1),
        SingleLang("Manga347", "https://manga347.com", "en", overrideVersionCode = 3),
        SingleLang("Manga3S", "https://manga3s.com", "en", overrideVersionCode = 1),
        SingleLang("Manga68", "https://manga68.com", "en", overrideVersionCode = 1),
        SingleLang("MangaBaz", "https://mangabaz.com", "tr"),
        SingleLang("MangaBob", "https://mangabob.com", "en", overrideVersionCode = 1),
        SingleLang("MangaCultivator", "https://mangacultivator.com", "en", overrideVersionCode = 1),
        SingleLang("MangaDods", "https://www.mangadods.com", "en", overrideVersionCode = 2),
        SingleLang("MangaEffect", "https://mangaeffect.com", "en", overrideVersionCode = 1),
        SingleLang("MangaGreat", "https://mangagreat.com", "en", overrideVersionCode = 1),
        SingleLang("MangaKitsune", "https://mangakitsune.com", "en", isNsfw = true, overrideVersionCode = 3),
        SingleLang("MangaKomi", "https://mangakomi.com", "en", overrideVersionCode = 3),
        SingleLang("MangaLionz", "https://mangalionz.com", "ar"),
        SingleLang("MangaPL", "https://mangapl.com", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("MangaRave", "https://www.mangarave.com", "en", overrideVersionCode = 2),
        SingleLang("MangaRead.org", "https://www.mangaread.org", "en", className = "MangaReadOrg", overrideVersionCode = 1),
        SingleLang("MangaSco", "https://mangasco.com", "en", overrideVersionCode = 1),
        SingleLang("MangaSpark", "https://mangaspark.com", "ar"),
        SingleLang("MangaStein", "https://mangastein.com", "tr"),
        SingleLang("MangaStic", "https://mangastic.com", "en"),
        SingleLang("MangaTK", "https://mangatk.com", "en"),
        SingleLang("MangaTX", "https://mangatx.com", "en", overrideVersionCode = 1),
        SingleLang("MangaTeca", "https://www.mangateca.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("MangaTuli", "https://mangatuli.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("MangaUS", "https://mangaus.xyz", "en", overrideVersionCode = 2),
        SingleLang("MangaWT", "https://mangawt.com", "tr"),
        SingleLang("MangaYaku", "https://mangayaku.com", "id", overrideVersionCode = 1),
        SingleLang("MangaYami", "https://www.mangayami.club", "en", overrideVersionCode = 2),
        SingleLang("Mangaka3rb", "https://mangaka3rb.com", "ar"),
        SingleLang("Mangakik", "https://mangakik.com", "en"),
        SingleLang("Mangas Origines", "https://mangas-origines.fr", "fr" , true, overrideVersionCode = 1),
        SingleLang("Mangasushi", "https://mangasushi.net", "en", overrideVersionCode = 1),
        SingleLang("Mangauptocats", "https://mangauptocats.online", "th"),
        SingleLang("Mangazuki.me", "https://mangazuki.me", "en", className = "MangazukiMe", overrideVersionCode = 1),
        SingleLang("Mangceh", "https://mangceh.me", "id", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Manhua ES", "https://manhuaes.com", "en", overrideVersionCode = 4),
        SingleLang("Manhua Plus", "https://manhuaplus.com", "en", overrideVersionCode = 3),
        SingleLang("Manhua SY", "https://www.manhuasy.com", "en", overrideVersionCode = 1),
        SingleLang("ManhuaBox", "https://manhuabox.net", "en", overrideVersionCode = 1),
        SingleLang("ManhuaFast", "https://manhuafast.com", "en", overrideVersionCode = 1),
        SingleLang("ManhuaPro", "https://manhuapro.com", "en", overrideVersionCode = 2),
        SingleLang("ManhuaUS", "https://manhuaus.com", "en", overrideVersionCode = 2),
        SingleLang("Manhuaga", "https://manhuaga.com", "en", overrideVersionCode = 1),
        SingleLang("Manhualo", "https://manhualo.com", "en", overrideVersionCode = 1),
        SingleLang("Manhuas.net", "https://manhuas.net", "en", className = "Manhuasnet", overrideVersionCode = 2),
        SingleLang("Manhwa Raw", "https://manhwaraw.com", "ko"),
        SingleLang("Manhwa.club", "https://manhwa.club", "en", className="ManwhaClub", overrideVersionCode = 2), // wrong class name for backward compatibility
        SingleLang("Manhwa18.org", "https://manhwa18.org", "en", isNsfw = true, className = "Manhwa18Org", overrideVersionCode = 1),
        SingleLang("ManhwaNelo", "https://manhwanelo.com", "en"),
        SingleLang("Manhwatop", "https://manhwatop.com", "en", overrideVersionCode = 1),
        SingleLang("Manhwahentai.me", "https://manhwahentai.me", "en", className = "ManhwahentaiMe", isNsfw = true),
        SingleLang("ManyToon", "https://manytoon.com", "en", overrideVersionCode = 1),
        SingleLang("ManyToon.me", "https://manytoon.me", "en", isNsfw = true, className = "ManyToonMe", overrideVersionCode = 1),
        SingleLang("ManyToonClub", "https://manytoon.club", "ko"),
        SingleLang("ManyComic", "https://manycomic.com", "en", isNsfw = true),
        SingleLang("Mark Scans", "https://markscans.online", "pt-BR", overrideVersionCode = 2),
        SingleLang("Midnight Mess Scans", "https://midnightmess.org", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Milftoon", "https://milftoon.xxx", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Mixed Manga", "https://mixedmanga.com", "en", overrideVersionCode = 1),
        SingleLang("Mode Scanlator", "https://modescanlator.com", "pt-BR", overrideVersionCode = 1),
        SingleLang("Mortals Groove", "https://mortalsgroove.com", "en"),
        SingleLang("Mystical Merries", "https://mysticalmerries.com", "en", overrideVersionCode = 1),
        SingleLang("NeatManga", "https://neatmanga.com", "en", overrideVersionCode = 1),
        SingleLang("NekoScan", "https://nekoscan.com", "en", overrideVersionCode = 1),
        SingleLang("Neox Scanlator", "https://neoxscans.net", "pt-BR", overrideVersionCode = 5),
        SingleLang("Night Comic", "https://www.nightcomic.com", "en", overrideVersionCode = 1),
        SingleLang("Niji Translations", "https://niji-translations.com", "ar"),
        SingleLang("Ninjavi", "https://ninjavi.com", "ar", overrideVersionCode = 1),
        SingleLang("Nitro Scans", "https://nitroscans.com", "en"),
        SingleLang("NovelMic", "https://novelmic.com", "en", overrideVersionCode = 1),
        SingleLang("Oh No Manga", "https://ohnomanga.com", "en", isNsfw = true),
        SingleLang("Off Scan", "https://offscan.top", "pt-BR", overrideVersionCode = 2),
        SingleLang("OnManga", "https://onmanga.com", "en", overrideVersionCode = 1),
        SingleLang("Origami Orpheans", "https://origami-orpheans.com.br", "pt-BR", overrideVersionCode = 2),
        SingleLang("Paean Scans", "https://paeanscans.com", "en", overrideVersionCode = 1),
        SingleLang("Painful Nightz Scan", "https://painfulnightzscan.com", "en"),
        SingleLang("Platinum Crown", "https://platinumscans.com", "en", overrideVersionCode = 1),
        SingleLang("Pojok Manga", "https://pojokmanga.com", "id", overrideVersionCode = 2),
        SingleLang("PornComix", "https://www.porncomixonline.net", "en", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Pornwha", "https://pornwha.com", "en", isNsfw = true),
        SingleLang("Prisma Scans", "https://prismascans.net", "pt-BR"),
        SingleLang("Projeto Scanlator", "https://projetoscanlator.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("QueensManga ملكات المانجا", "https://queensmanga.com", "ar", className = "QueensManga"),
        SingleLang("Random Scan", "https://randomscan.online", "pt-BR", overrideVersionCode = 3),
        SingleLang("Random Translations", "https://randomtranslations.com", "en", overrideVersionCode = 1),
        SingleLang("Raw Mangas", "https://rawmangas.net", "ja", isNsfw = true, overrideVersionCode = 1),
        SingleLang("RawDEX", "https://rawdex.net", "ko", isNsfw = true),
        SingleLang("ReadManhua", "https://readmanhua.net", "en", overrideVersionCode = 2),
        SingleLang("Renascence Scans (Renascans)", "https://new.renascans.com", "en", className = "RenaScans", overrideVersionCode = 1),
        SingleLang("Reset Scans", "https://reset-scans.com", "en", overrideVersionCode = 3),
        SingleLang("Rüya Manga", "https://www.ruyamanga.com", "tr", className = "RuyaManga"),
        SingleLang("S2Manga", "https://s2manga.com", "en", overrideVersionCode = 1),
        SingleLang("SISI GELAP", "https://sisigelap.club/", "id", overrideVersionCode = 1),
        SingleLang("SamuraiScan", "https://samuraiscan.com", "es"),
        SingleLang("Sani-Go", "https://sani-go.net", "ar", className = "SaniGo"),
        SingleLang("Setsu Scans", "https://setsuscans.com", "en"),
        SingleLang("Shield Manga", "https://shieldmanga.club", "en", overrideVersionCode = 2),
        SingleLang("Shooting Star Scans", "https://shootingstarscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("ShoujoHearts", "https://shoujohearts.com", "en", overrideVersionCode = 2),
        SingleLang("SiXiang Scans", "http://www.sixiangscans.com", "en", overrideVersionCode = 1),
        SingleLang("Siyahmelek", "https://siyahmelek.com", "tr", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Skymanga", "https://skymanga.co", "en", overrideVersionCode = 1),
        SingleLang("Sleeping Knight Scans", "https://skscans.com", "en", overrideVersionCode = 2),
        SingleLang("Sleepy Translations", "https://sleepytranslations.com/", "en", overrideVersionCode = 1),
        SingleLang("SocialWeebs", "https://socialweebs.in/", "en"),
        SingleLang("Solo Leveling", "https://readsololeveling.online", "en"),
        SingleLang("SoloScanlation", "https://soloscanlation.site", "en"),
        SingleLang("StageComics", "https://stagecomics.com", "pt-BR", overrideVersionCode = 2),
        SingleLang("Sugar Babies", "https://sugarbscan.com", "en", overrideVersionCode = 1),
        SingleLang("Sweet Time Scan", "https://sweetscan.net", "pt-BR", overrideVersionCode = 1),
        SingleLang("TheFluffyHangoutGroup", "https://www.fluffyhangout.club", "en", overrideVersionCode = 2),
        SingleLang("Three Queens Scanlator", "https://tqscan.com.br", "pt-BR", overrideVersionCode = 2),
        SingleLang("Time Naight", "https://timenaight.com", "tr"),
        SingleLang("ToonGod", "https://www.toongod.com", "en", overrideVersionCode = 1),
        SingleLang("Toonily", "https://toonily.com", "en", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Toonily.net", "https://toonily.net", "en", isNsfw = true, className = "ToonilyNet", overrideVersionCode = 1),
        SingleLang("Top Manhua", "https://topmanhua.com", "en", overrideVersionCode = 1),
        SingleLang("Traducciones Amistosas", "https://nartag.com", "es", overrideVersionCode = 1),
        SingleLang("TritiniaScans", "https://tritinia.com", "en", overrideVersionCode = 1),
        SingleLang("TruyenTranhAudio.com", "https://truyentranhaudio.com", "vi", className = "TruyenTranhAudioCom"),
        SingleLang("TruyenTranhAudio.online", "https://truyentranhaudio.online", "vi", className = "TruyenTranhAudioOnline"),
        SingleLang("Tsundoku Traduções", "https://tsundokutraducoes.com.br", "pt-BR", pkgName = "tsundokutraducoes", className = "TsundokuTraducoes", overrideVersionCode = 2),
        SingleLang("TuManga.net", "https://tumanga.net", "es", className = "TuMangaNet"),
        SingleLang("Twilight Scans", "https://twilightscans.com", "en", overrideVersionCode = 1),
        SingleLang("Türkçe Manga", "https://turkcemanga.com", "tr", className = "TurkceManga"),
        SingleLang("Unemployed Scans", "https://unemployedscans.com", "en", overrideVersionCode = 1),
        SingleLang("Uyuyan Balik", "https://uyuyanbalik.com/", "tr"),
        SingleLang("Vanguard Bun", "https://vanguardbun.com/", "en", overrideVersionCode = 1),
        SingleLang("Visbellum", "https://visbellum.com", "pt-BR"),
        SingleLang("Volkan Scans", "https://volkanscans.com", "en", overrideVersionCode = 1),
        SingleLang("Wakamics", "https://wakamics.net", "en"),
        SingleLang("Wakascan", "https://wakascan.com", "fr", overrideVersionCode = 1),
        SingleLang("War Queen Scan", "https://wqscan.com.br", "pt-BR", overrideVersionCode = 3),
        SingleLang("WebNovel", "https://webnovel.live", "en", className = "WebNovelLive", overrideVersionCode = 3),
        SingleLang("WebToonily", "https://webtoonily.com", "en"),
        SingleLang("Webtoon Hatti", "https://webtoonhatti.com/", "tr"),
        SingleLang("WebtoonUK", "https://webtoon.uk", "en", overrideVersionCode = 1),
        SingleLang("WebtoonXYZ", "https://www.webtoon.xyz", "en", overrideVersionCode = 2),
        SingleLang("Winter Scan", "https://winterscan.com.br", "pt-BR", overrideVersionCode = 2),
        SingleLang("Wonderland", "https://landwebtoons.site", "pt-BR", overrideVersionCode = 2),
        SingleLang("WoopRead", "https://woopread.com", "en", overrideVersionCode = 1),
        SingleLang("WuxiaWorld", "https://wuxiaworld.site", "en", overrideVersionCode = 1),
        SingleLang("XuN Scans", "https://reader.xunscans.xyz", "en", overrideVersionCode = 1),
        SingleLang("Yaoi Fan Clube", "https://yaoifanclube.com.br", "pt-BR", isNsfw = true, overrideVersionCode = 1),
        SingleLang("Yaoi.mobi", "https://yaoi.mobi", "en", isNsfw = true, className = "YaoiManga", pkgName = "yaoimanga", overrideVersionCode = 3),
        SingleLang("Yaoi Toshokan", "https://yaoitoshokan.net", "pt-BR", isNsfw = true, overrideVersionCode = 2),
        SingleLang("Yuri Verso", "https://yuri.live", "pt-BR", overrideVersionCode = 2),
        SingleLang("Zin Translator", "https://zinmanga.com", "en", overrideVersionCode = 1),
        SingleLang("شبكة كونان العربية", "https://www.manga.detectiveconanar.com", "ar", className = "DetectiveConanAr", overrideVersionCode = 1),
        SingleLang("مانجا العاشق", "https://3asq.org", "ar", className = "Manga3asq"),
        SingleLang("مانجا العرب", "https://www.manhwa.ae", "ar", className = "ManhwaAe"),
        SingleLang("مانجا عرب تيم Manga Arab Team", "https://mangaarabteam.com", "ar", className = "MangaArabTeam"),
        SingleLang("مانجا ليك", "https://mangalek.com", "ar", className = "Mangalek"),
        SingleLang("مانجا لينك", "https://mangalink.io", "ar", className = "MangaLinkio", overrideVersionCode = 1),
        SingleLang("موقع لترجمة المانجا", "https://golden-manga.com", "ar", className = "GoldenManga"),
        SingleLang("Ancient Empire Scan", "https://ancientempirescan.website", "es")
    )

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            MadaraGenerator().createAll()
        }
    }
}
