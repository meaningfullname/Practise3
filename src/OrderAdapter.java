class OrderAdapter implements NewOrderProcessor {
    private LegacyOrderProcessor legacyOrderProcessor;

    OrderAdapter(LegacyOrderProcessor legacyOrderProcessor) {
        this.legacyOrderProcessor = legacyOrderProcessor;
    }

    public void processNewOrder() {
        legacyOrderProcessor.processLegacyOrder(); // Adapting the old method to the new interface
    }
}