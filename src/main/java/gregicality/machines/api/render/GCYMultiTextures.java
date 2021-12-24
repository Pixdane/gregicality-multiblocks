package gregicality.machines.api.render;

import gregicality.machines.GregicalityMultiblocks;
import gregtech.client.renderer.texture.cube.OrientedOverlayRenderer;
import gregtech.client.renderer.texture.cube.SimpleOverlayRenderer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;

import static gregtech.client.renderer.texture.cube.OrientedOverlayRenderer.OverlayFace.FRONT;

@Mod.EventBusSubscriber(modid = GregicalityMultiblocks.MODID, value = Side.CLIENT)
public class GCYMultiTextures {

    // Multiblock Controllers
    public static OrientedOverlayRenderer LARGE_MACERATOR_OVERLAY;
    public static OrientedOverlayRenderer ALLOY_BLAST_SMELTER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_ARC_FURNACE_OVERLAY;
    public static OrientedOverlayRenderer LARGE_ASSEMBLER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_AUTOCLAVE_OVERLAY;
    public static OrientedOverlayRenderer LARGE_BENDER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_BREWERY_OVERLAY;
    public static OrientedOverlayRenderer LARGE_CENTRIFUGE_OVERLAY;
    public static OrientedOverlayRenderer LARGE_CHEMICAL_BATH_OVERLAY;
    public static OrientedOverlayRenderer CHEMICAL_PLANT_OVERLAY;
    public static OrientedOverlayRenderer LARGE_EXTRACTOR_OVERLAY;
    public static OrientedOverlayRenderer LARGE_CUTTER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_DISTILLERY_OVERLAY;
    public static OrientedOverlayRenderer LARGE_ELECTROLYZER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_POLARIZER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_EXTRUDER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_SOLIDIFIER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_MIXER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_PACKAGER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_ENGRAVER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_SIFTER_OVERLAY;
    public static OrientedOverlayRenderer LARGE_WIREMILL_OVERLAY;
    public static OrientedOverlayRenderer ELECTRIC_IMPLOSION_OVERLAY;
    public static OrientedOverlayRenderer LARGE_MASS_FABRICATOR_OVERLAY;
    public static OrientedOverlayRenderer LARGE_REPLICATOR_OVERLAY;
    public static OrientedOverlayRenderer MEGA_BLAST_FURNACE_OVERLAY;
    public static OrientedOverlayRenderer MEGA_VACUUM_FREEZER_OVERLAY;


    // Hatches
    public static OrientedOverlayRenderer PARALLEL_HATCH_MK1_OVERLAY;
    public static OrientedOverlayRenderer PARALLEL_HATCH_MK2_OVERLAY;
    public static OrientedOverlayRenderer PARALLEL_HATCH_MK3_OVERLAY;
    public static OrientedOverlayRenderer PARALLEL_HATCH_MK4_OVERLAY;


    // Casings
    public static SimpleOverlayRenderer MACERATOR_CASING;
    public static SimpleOverlayRenderer BLAST_CASING;
    public static SimpleOverlayRenderer ASSEMBLING_CASING;
    public static SimpleOverlayRenderer AUTOCLAVE_CASING;
    public static SimpleOverlayRenderer BENDER_CASING;
    public static SimpleOverlayRenderer BREWERY_CASING;
    public static SimpleOverlayRenderer CENTRIFUGE_CASING;
    public static SimpleOverlayRenderer BATH_CASING;
    public static SimpleOverlayRenderer FLUID_SAFE_CASING;
    public static SimpleOverlayRenderer CUTTER_CASING;
    public static SimpleOverlayRenderer DISTILLlERY_CASING;
    public static SimpleOverlayRenderer ELECTROLYZER_CASING;
    public static SimpleOverlayRenderer ELECTROMAGNET_CASING;
    public static SimpleOverlayRenderer EXTRUDER_CASING;
    public static SimpleOverlayRenderer MIXER_CASING;
    public static SimpleOverlayRenderer ENGRAVER_CASING;
    public static SimpleOverlayRenderer SIFTER_CASING;
    public static SimpleOverlayRenderer WIREMILL_CASING;
    public static SimpleOverlayRenderer ATOMIC_CASING;


    public static void preInit() {
        // Multiblock Controllers
        LARGE_MACERATOR_OVERLAY = new OrientedOverlayRenderer("multiblock/large_macerator", FRONT);
        ALLOY_BLAST_SMELTER_OVERLAY = new OrientedOverlayRenderer("multiblock/alloy_blast_smelter", FRONT);
        LARGE_ARC_FURNACE_OVERLAY = new OrientedOverlayRenderer("multiblock/large_arc_furnace", FRONT);
        LARGE_ASSEMBLER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_assembler", FRONT);
        LARGE_AUTOCLAVE_OVERLAY = new OrientedOverlayRenderer("multiblock/large_autoclave", FRONT);
        LARGE_BENDER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_bender", FRONT);
        LARGE_BREWERY_OVERLAY = new OrientedOverlayRenderer("multiblock/large_brewery", FRONT);
        LARGE_CENTRIFUGE_OVERLAY = new OrientedOverlayRenderer("multiblock/large_centrifuge", FRONT);
        LARGE_CHEMICAL_BATH_OVERLAY = new OrientedOverlayRenderer("multiblock/large_chemical_bath", FRONT);
        CHEMICAL_PLANT_OVERLAY = new OrientedOverlayRenderer("multiblock/chemical_plant", FRONT);
        LARGE_EXTRACTOR_OVERLAY = new OrientedOverlayRenderer("multiblock/large_extractor", FRONT);
        LARGE_CUTTER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_cutter", FRONT);
        LARGE_DISTILLERY_OVERLAY = new OrientedOverlayRenderer("multiblock/large_distillery", FRONT);
        LARGE_ELECTROLYZER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_electrolyzer", FRONT);
        LARGE_POLARIZER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_polarizer", FRONT);
        LARGE_EXTRUDER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_extruder", FRONT);
        LARGE_SOLIDIFIER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_solidifier", FRONT);
        LARGE_MIXER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_mixer", FRONT);
        LARGE_PACKAGER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_packager", FRONT);
        LARGE_ENGRAVER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_engraver", FRONT);
        LARGE_SIFTER_OVERLAY = new OrientedOverlayRenderer("multiblock/large_sifter", FRONT);
        LARGE_WIREMILL_OVERLAY = new OrientedOverlayRenderer("multiblock/large_wiremill", FRONT);
        ELECTRIC_IMPLOSION_OVERLAY = new OrientedOverlayRenderer("multiblock/electric_implosion", FRONT);
        LARGE_MASS_FABRICATOR_OVERLAY = new OrientedOverlayRenderer("multiblock/large_mass_fabricator", FRONT);
        LARGE_REPLICATOR_OVERLAY = new OrientedOverlayRenderer("multiblock/large_replicator", FRONT);
        MEGA_BLAST_FURNACE_OVERLAY = new OrientedOverlayRenderer("multiblock/mega_blast_furnace", FRONT);
        MEGA_VACUUM_FREEZER_OVERLAY = new OrientedOverlayRenderer("multiblock/mega_vacuum_freezer", FRONT);

        // Hatches
        PARALLEL_HATCH_MK1_OVERLAY = new OrientedOverlayRenderer("hatches/parallel_hatch_mk1", FRONT);
        PARALLEL_HATCH_MK2_OVERLAY = new OrientedOverlayRenderer("hatches/parallel_hatch_mk2", FRONT);
        PARALLEL_HATCH_MK3_OVERLAY = new OrientedOverlayRenderer("hatches/parallel_hatch_mk3", FRONT);
        PARALLEL_HATCH_MK4_OVERLAY = new OrientedOverlayRenderer("hatches/parallel_hatch_mk4", FRONT);

        // Casings
        MACERATOR_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/macerator_casing");
        BLAST_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/blast_casing");
        ASSEMBLING_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/assembler_casing");
        AUTOCLAVE_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/autoclave_casing");
        BENDER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/bender_casing");
        BREWERY_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/brewery_casing");
        CENTRIFUGE_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/centrifuge_casing");
        BATH_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/bath_casing");
        FLUID_SAFE_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/fluid_safe_casing");
        CUTTER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/cutter_casing");
        DISTILLlERY_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/distillery_casing");
        ELECTROLYZER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/electrolyzer_casing");
        ELECTROMAGNET_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/electromagnet_casing");
        EXTRUDER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/extruder_casing");
        MIXER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/mixer_casing");
        ENGRAVER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing/engraver_casing");
        SIFTER_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing_2/sifter_casing");
        WIREMILL_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing_2/wiremill_casing");
        ATOMIC_CASING = new SimpleOverlayRenderer("casings/large_multiblock_casing_2/atomic_casing");
    }
}
